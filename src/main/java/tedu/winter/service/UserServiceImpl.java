package tedu.winter.service;

//import com.github.pagehelper.PageHelper;
import tedu.winter.mapper.UserMapper;
import tedu.winter.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUser(String account) {
        return userMapper.selectByPrimaryKey(account);
    }

    @Override
    public int addUser(User user) {

        return userMapper.insertSelective(user);
    }


}



