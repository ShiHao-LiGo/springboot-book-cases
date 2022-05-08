package com.example.demo.repository;

import com.example.demo.model.AyUserRoleRel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 描述：用户角色关联Repository
 * @author Lishihao
 * @create 2022/04/29
 */
public interface AyUserRoleRelRepository extends JpaRepository<AyUserRoleRel,String> {

    List<AyUserRoleRel> findByUserId(@Param("userId") String userID);
}
