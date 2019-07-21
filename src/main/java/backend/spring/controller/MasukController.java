package backend.spring.controller;

import backend.spring.factory.ServiceFac;
import backend.spring.model.MasukModel;
import backend.spring.service.MasukService;
import backend.spring.util.response.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MasukController {
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
}
