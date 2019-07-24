package backend.spring.repository;

import backend.spring.model.MasukModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasukRepostory extends CrudRepository<MasukModel, String> {
    @Query(value = "Select * from masuk_model a where a.username_login =: 'username'",nativeQuery = true)
    MasukModel getMasukModelByUsernameLogin(String username);
}
