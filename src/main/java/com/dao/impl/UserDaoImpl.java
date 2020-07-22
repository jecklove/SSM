package com.dao.impl;

import com.dao.UserDao;
import com.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {


    public  UserDaoImpl(SqlSessionTemplate sqlSessionTemplate){
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return getSqlSession().delete("deleteByPrimaryKey");
    }

    @Override
    public int insert(User record) {
        return getSqlSession().insert("insert",record);
    }

    @Override
    public int insertSelective(User record) {
        return getSqlSession().insert("insertSelective",record);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {

        return getSqlSession().selectOne("selectByPrimaryKey",id);
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return getSqlSession().update("updateByPrimaryKeySelective",record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return getSqlSession().update("updateByPrimaryKey",record);
    }

    @Override
    public List<User> selectList() {
        return getSqlSession().selectList("selectList");
    }
}
