package com.blog.login;

import com.blog.mapper.UserMapper;
import com.blog.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User get(String guid) {
        return userMapper.selectByGuid("a");
    }
}
