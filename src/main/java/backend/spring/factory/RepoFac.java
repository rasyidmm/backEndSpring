package backend.spring.factory;

import backend.spring.repository.MasukRepostory;
import backend.spring.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepoFac {

    @Autowired
    MemberRepository memberRepository;
    @Autowired
    MasukRepostory masukRepostory;

    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
    public MasukRepostory getMasukRepostory(){
        return masukRepostory;
    }
}
