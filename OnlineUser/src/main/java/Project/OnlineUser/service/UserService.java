package Project.OnlineUser.service;

import Project.OnlineUser.model.UserDtls;

public interface UserService{
    public UserDtls createUser(UserDtls user);

    public boolean checkEmail(String email);
}
