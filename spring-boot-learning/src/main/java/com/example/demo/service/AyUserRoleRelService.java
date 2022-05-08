package com.example.demo.service;

import com.example.demo.model.AyUserRoleRel;

import java.util.List;

/**
 * 描述：用户角色关联Service
 * @author Lishihao
 * @create 2022/04/29
 */
public interface AyUserRoleRelService {

    List<AyUserRoleRel> findByUserId(String userId);
}
