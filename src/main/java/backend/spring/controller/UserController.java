package backend.spring.controller;


import backend.spring.factory.ServiceFac;
import backend.spring.model.UserModel;
import backend.spring.service.UserService;
import backend.spring.util.response.RestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserController {
    @Autowired
    ServiceFac serviceFac;
    @RequestMapping(value = "/api/getAllUserData", method = RequestMethod.GET)
    public ResponseEntity<RestResponse<List<UserModel>>> getAllUserData() {
        RestResponse<List<UserModel>> result = new RestResponse<>();

        UserService userService = serviceFac.getUserService();
        result.setMessage("");
        result.setSuccess(true);
        result.setData(userService.getAllUser());
        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<>(result, httpStatus);
    }
}
