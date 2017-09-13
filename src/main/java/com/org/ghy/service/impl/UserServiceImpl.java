package com.org.ghy.service.impl;

import com.org.ghy.model.RoleEntity;
import com.org.ghy.model.UserEntity;
import com.org.ghy.model.UserRoleEntity;
import com.org.ghy.service.IUserService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/3/20.
 */
@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public List<UserEntity> queryUser() {

        Session session = hibernateTemplate.getSessionFactory().openSession();
        List<UserEntity> list = session.createQuery("from UserEntity ").list();

        for(UserEntity userEntity:list) {
            Iterator<UserRoleEntity> iterator = userEntity.getUserRolesByUserId().iterator();
            while (iterator.hasNext()) {
                UserRoleEntity userRoleEntity = iterator.next();
                System.out.println("角色ID:"+userRoleEntity.getRoleId());
            }
        }
        session.close();
        return list;
    }

    @Override
    public List<UserEntity> queryUserListByRoleId(Integer roleId) {
        List<UserEntity> list = new ArrayList<>();

        Session session = hibernateTemplate.getSessionFactory().openSession();
        RoleEntity roleEntity = session.get(RoleEntity.class,roleId);
        Iterator<UserRoleEntity> iterator = roleEntity.getUserRolesByRoleId().iterator();
        while (iterator.hasNext()){
            UserRoleEntity userRoleEntity = iterator.next();
            int userId = userRoleEntity.getUserId();
            UserEntity userEntity = session.get(UserEntity.class,userId);
            System.out.println(userEntity.getUserName());
            list.add(userEntity);
        }
        session.close();
        return list;
    }
}
