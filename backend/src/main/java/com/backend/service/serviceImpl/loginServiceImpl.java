package com.backend.service.serviceImpl;

import com.backend.mapper.UserMapper;
import com.backend.pojo.User;
import com.backend.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class loginServiceImpl implements loginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int checkAccount(String name, String password) {
        User user = userMapper.selectByName(name);
        System.out.println("Impl");
        if (password.equals(user.getPassword()))
            return 1;
        else
            return 0;
    }
}
