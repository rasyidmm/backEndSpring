package backend.spring.factory;

import backend.spring.model.MasukModel;
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

    public MemberService getMemberService() {
        return memberService;
    }
    public MasukService getMasukService(){
        return masukService;
    }
}
