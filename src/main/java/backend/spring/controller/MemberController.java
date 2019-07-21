package backend.spring.controller;

import backend.spring.factory.ServiceFac;
import backend.spring.model.MemeberModel;
import backend.spring.service.MemberService;
import backend.spring.util.response.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
@RestController
public class MemberController {
    @Autowired
    ServiceFac serviceFac;
    @RequestMapping(value = "/api/getAllUserData", method = RequestMethod.GET)
    public ResponseEntity<RestResponse<List<MemeberModel>>> getAllUserData() {
        RestResponse<List<MemeberModel>> result = new RestResponse<>();

        MemberService memberService = serviceFac.getMemberService();
        result.setMessage("");
        result.setSuccess(true);
        result.setData(memberService.getAllMember());
        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<>(result, httpStatus);
    }


}
