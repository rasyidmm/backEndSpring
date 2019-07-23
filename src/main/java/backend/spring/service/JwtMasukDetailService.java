package backend.spring.service;

import backend.spring.dto.MasukDto;
import backend.spring.factory.ServiceFac;
import backend.spring.model.MasukModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtMasukDetailService implements UserDetailsService {

    @Autowired
    private ServiceFac serviceFac;
    private PasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String usename) throws UsernameNotFoundException {
        MasukModel member = serviceFac.getMasukService().getMasukModelByUsernameLogin(usename);
        if(member == null){
            throw new  UsernameNotFoundException("User Kagak Ketemu CAY :" +member);
        }
        return new org.springframework.security.core.userdetails.User(member.getUsernameLogin(),member.getPasswordLogin(),new ArrayList<>());
    }

    public MasukModel save(MasukDto masuk){
        MasukModel newMasuk = new MasukModel();
        newMasuk.setUsernameLogin(masuk.getUsername());
        newMasuk.setPasswordLogin(bcryptEncoder.encode(masuk.getPassword()));
        return serviceFac.getMasukService().SaveOrUpdateMasuk(newMasuk);
    }

}
