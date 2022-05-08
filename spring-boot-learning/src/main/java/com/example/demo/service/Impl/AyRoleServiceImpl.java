package com.example.demo.service.Impl;

import com.example.demo.model.AyRole;
import com.example.demo.repository.AyRoleRepository;
import com.example.demo.service.AyRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 描述：用户角色Service
 * @author Lishihao
 * @create 2022/04/29
 */
@Service
public class AyRoleServiceImpl implements AyRoleService {

    @Resource
    private AyRoleRepository ayRoleRepository;

    @Override
    public AyRole find(String id){
        return ayRoleRepository.findById(id).get();
    }
}
