package backend.spring.service;

import backend.spring.dao.MasukDao;
import backend.spring.factory.RepoFac;
import backend.spring.model.MasukModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MasukService implements MasukDao {
    @Autowired
    RepoFac repoFac;
    @Override
    public List<MasukModel> getAllMasuk() {
        List<MasukModel>lm =  new ArrayList<>();
        repoFac.getMasukRepostory().findAll().forEach(lm::add);
        return lm;
    }

    @Override
    public MasukModel getMasukById(String id) {
        MasukModel mid = repoFac.getMasukRepostory().findById(id).get();
        return mid;
    }

    @Override
    public MasukModel SaveOrUpdateMasuk(MasukModel k) {
        repoFac.getMasukRepostory().save(k);
        return k;
    }

    @Override
    public void deleteMasuk(String id) {
        repoFac.getMasukRepostory().deleteById(id);
    }

    @Override
    public void deleteMasuk(MasukModel d) {
        repoFac.getMasukRepostory().delete(d);
    }
    public  MasukModel getMasukModelByUsernameLogin(String username){
       return repoFac.getMasukRepostory().getMasukModelByUsernameLogin(username);
    }
}
