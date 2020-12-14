package tedu.winter.service;

import tedu.winter.model.User;


public interface UserService {

    int addUser(User user);
    User selectUser(String account);

}

