package com.example.api;


import com.example.domain.AyUser;

/**
 * 描述：用户接口
 * @author  Ay 
 * @date    2017/12/16.
 */
public interface AyUserDubboService {

    AyUser findByUserNameAndPassword(String name, String password);
}
