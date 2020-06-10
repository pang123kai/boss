package com.csi.boss.service.impl;

import com.csi.boss.entity.Users;
import com.csi.boss.entity.UsersExample;
import com.csi.boss.mapping.UsersMapper;
import com.csi.boss.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
 @Autowired
    private UsersMapper usersMapper;
    @Override
    public List<Users> getAll() {
        UsersExample usersExample=new UsersExample();
        return usersMapper.selectByExample(usersExample);
    }

}
