package backend.spring.controller;

import backend.spring.dto.RegisterUserDTO;
import backend.spring.factory.ServiceFac;
import backend.spring.model.MasukModel;
import backend.spring.model.MemeberModel;
import backend.spring.service.MasukService;
import backend.spring.util.response.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MasukController {
    @Autowired
    PasswordEncoder bcryptEncoder;
    @Autowired
    ServiceFac serviceFac;
    @RequestMapping(value = "/api/getAllLoginData",method = RequestMethod.GET)
    public ResponseEntity<RestResponse<List<MasukModel>>>getAllLoginData(){
        RestResponse<List<MasukModel>>result =  new RestResponse<>();

        MasukService masukService = serviceFac.getMasukService();
        result.setMessage("");
        result.setSuccess(true);
        result.setData(masukService.getAllMasuk());
        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<>(result, httpStatus);
    }
    @RequestMapping(value = "/api/registeruser",method = RequestMethod.POST)
    public ResponseEntity<?>regiterUser(@RequestBody RegisterUserDTO registerUserDTO)throws  Exception{
        MemeberModel m = new MemeberModel();

        m.setAgamaUser(registerUserDTO.getAgamaUser());
        m.setAlamatUser(registerUserDTO.getAlamatUser());
        m.setNoHpUser(registerUserDTO.getNoHpUser());
        m.setPendidikanUser(registerUserDTO.getPendidikanUser());
        m.setNamaDepanUser(registerUserDTO.getNamaDepanUser());
        m.setNamaBelakangUser(registerUserDTO.getNamaBelakangUser());
        m.setFotoUser(registerUserDTO.getFotoUser());
        serviceFac.getMemberService().SaveOrUpdateMember(m);
        MasukModel k = new MasukModel();
        k.setId(serviceFac.getMemberService().getMemberById(m.getId()).getId());
        k.setMemeberModel(m);
        k.setPasswordLogin(bcryptEncoder.encode(registerUserDTO.getPasswordLogin()));
        k.setUsernameLogin(registerUserDTO.getUsernameLogin());
        serviceFac.getMasukService().SaveOrUpdateMasuk(k);
        return ResponseEntity.ok(serviceFac.getMasukService());
    }
}
