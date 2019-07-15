package backend.spring.factory;

import backend.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceFac {
    @Autowired
    UserService userService;

    public UserService getUserService() {
        return userService;
    }
}
