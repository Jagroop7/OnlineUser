package Project.OnlineUser.repository;

import Project.OnlineUser.model.UserDtls;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserDtls,Integer> {
    public boolean existsByEmail(String email);

    public UserDtls findByEmail(String email);

}

