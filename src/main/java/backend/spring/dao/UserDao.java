package backend.spring.dao;

import backend.spring.model.UserModel;

import java.util.List;

public interface UserDao {
    public List<UserModel> getAllUser();

    public UserModel getUserById(String id);

    public void SaveOrUpdateUser(UserModel k);

    public void deleteUser(String id);

    public void deleteUser(UserModel d);
}
