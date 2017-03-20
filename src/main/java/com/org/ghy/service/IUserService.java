package com.org.ghy.service;

import com.org.ghy.bean.UserEntity;

import java.util.List;

/**
 * Created by Administrator on 2017/3/19.
 */
public interface IUserService {
    List<UserEntity> queryUser();
}
