package com.org.ghy.service.impl;

import com.org.ghy.bean.UserEntity;
import com.org.ghy.service.IUserService;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/3/20.
 */
@Service
public class UserServiceImpl implements IUserService{
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public List<UserEntity> queryUser() {
     List<UserEntity> list =  (List<UserEntity>)hibernateTemplate.execute(new HibernateCallback() {
            public List<UserEntity> doInHibernate(Session session) throws HibernateException {
                String sql = " select * from user where id=:id ";
                NativeQuery<UserEntity> query = session.createNativeQuery(sql, UserEntity.class);
                query.setParameter("id",1);
                return query.list();
            }
        });
     return list;
    }
}
