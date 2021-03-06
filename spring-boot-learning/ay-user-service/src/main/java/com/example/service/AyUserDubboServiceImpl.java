package com.example.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.AyUserDubboService;
import com.example.domain.AyUser;

/**
 * 描述：对外提供用户服务类
 * Created by Ay on 2017/12/16.
 */
@Service(version = "1.0")
public class AyUserDubboServiceImpl implements AyUserDubboService {

    @Override
    public AyUser findByUserNameAndPassword(String name, String password) {
        //连接数据库，查询用户数据，此处省略
        AyUser ayUser = new AyUser();
        ayUser.setName("aa");
        ayUser.setPassword("123456");
        return ayUser;
    }
}
