package com.service.impl;

import com.dao.UserDao;
import com.entity.User;
import com.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        int result = userDao.deleteByPrimaryKey(id);
        return result;
    }

    @Override
    public int insert(User record) {
        int result = userDao.insert(record);
        return result;
    }

    @Override
    public int insertSelective(User record) {
        int result = userDao.insertSelective(record);

        return result;
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        User user = userDao.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        int result = userDao.updateByPrimaryKeySelective(record);
        return result;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        int result = userDao.updateByPrimaryKey(record);
        return result;
    }

    @Override
    public List<User> selectList() {
        return userDao.selectList();
    }
}
