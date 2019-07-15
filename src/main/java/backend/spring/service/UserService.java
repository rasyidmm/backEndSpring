package backend.spring.service;

import backend.spring.dao.UserDao;
import backend.spring.factory.RepoFac;
import backend.spring.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService implements UserDao {
    @Autowired
    RepoFac repoFac;
    @Override
    public List<UserModel> getAllUser() {
        List<UserModel>lu = new ArrayList<>();
        repoFac.getUserRepository().findAll().forEach(lu::add);
        return lu;

    }

    @Override
    public UserModel getUserById(String id) {
       UserModel dm = repoFac.getUserRepository().findById(id).get();
       return dm;
    }

    @Override
    public void SaveOrUpdateUser(UserModel k) {

    }

    @Override
    public void deleteUser(long id) {

    }

    @Override
    public void deleteUser(UserModel d) {

    }
}
