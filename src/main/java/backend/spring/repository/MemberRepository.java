package backend.spring.repository;

import backend.spring.model.MemeberModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemeberModel, String> {
}
