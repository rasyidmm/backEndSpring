package backend.spring.factory;

import backend.spring.security.service.JwtMasukDetailService;
import backend.spring.service.MasukService;
import backend.spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceFac {
    @Autowired
    MemberService memberService;
    @Autowired
    MasukService masukService;
    @Autowired
    JwtMasukDetailService jwtMasukDetailService;

    public MemberService getMemberService() {
        return memberService;
    }
    public MasukService getMasukService(){
        return masukService;
    }
    public  JwtMasukDetailService getJwtMasukDetailService(){
        return  jwtMasukDetailService;
    }
}
