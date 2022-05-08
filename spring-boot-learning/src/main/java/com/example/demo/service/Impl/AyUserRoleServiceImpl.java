package com.example.demo.service.Impl;

import com.example.demo.model.AyUserRoleRel;
import com.example.demo.repository.AyUserRoleRelRepository;
import com.example.demo.service.AyUserRoleRelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 描述：用户角色关联Service
 * @author Lishihao
 * @create 2022/04/29
 */
@Service
public class AyUserRoleServiceImpl implements AyUserRoleRelService {

    @Resource
    private AyUserRoleRelRepository ayUserRoleRelRepository;

    @Override
    public List<AyUserRoleRel> findByUserId(String userId) {
        return ayUserRoleRelRepository.findByUserId(userId);
    }
}
