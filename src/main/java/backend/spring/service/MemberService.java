package backend.spring.service;

import backend.spring.dao.MemberDao;
import backend.spring.factory.RepoFac;
import backend.spring.model.MemeberModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MemberService implements MemberDao {
    @Autowired
    RepoFac repoFac;
    @Override
    public List<MemeberModel> getAllMember() {
        List<MemeberModel>lu = new ArrayList<>();
        repoFac.getMemberRepository().findAll().forEach(lu::add);
        return lu;

    }

    @Override
    public MemeberModel getMemberById(Long id) {
       MemeberModel dm = repoFac.getMemberRepository().findById(id).get();
       return dm;
    }

    @Override
    public void SaveOrUpdateMember(MemeberModel k) {
        repoFac.getMemberRepository().save(k);

    }

    @Override
    public void deleteMember(Long id) {
        repoFac.getMemberRepository().deleteById(id);

    }

    @Override
    public void deleteMember(MemeberModel d) {
        repoFac.getMemberRepository().delete(d);

    }

}
