package com.example.vueapitest.mapper.jpa;

import com.example.vueapitest.pojo.po.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserJPA extends JpaRepository<SysUser,String> {
}
