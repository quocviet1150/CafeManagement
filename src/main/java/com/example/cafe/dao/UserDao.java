package com.example.cafe.dao;

import com.example.cafe.Entity.User;
import com.example.cafe.wrapper.UserWrapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {

    User findByUserNameId(@Param("userName") String userName);

    List<UserWrapper> getAllUser();

    List<String> getAllAdmin();

    @Transactional
    @Modifying
    Integer updateStatus(@Param("status") String status, @Param("id") Integer id);

    User findByUserName(String userName);

    @Transactional
    @Modifying
    Integer updateDecentralization(@Param("role") String role, @Param("id") Integer id);

    Integer countByRole(String role);

}
