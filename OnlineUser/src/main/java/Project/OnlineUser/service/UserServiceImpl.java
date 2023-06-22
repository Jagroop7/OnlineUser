package Project.OnlineUser.service;

import Project.OnlineUser.model.UserDtls;
import Project.OnlineUser.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserRepo userRepo;
    @Override
    public UserDtls createUser(UserDtls user) {

        return userRepo.save(user);
    }

    @Override
    public boolean checkEmail(String email) {
        return userRepo.existsByEmail(email);
    }
}
