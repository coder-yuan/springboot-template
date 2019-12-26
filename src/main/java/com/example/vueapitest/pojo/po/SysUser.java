package com.example.vueapitest.pojo.po;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name="sys_user")
@Entity
public class SysUser {

    @Id
    private String id;

    private String name;

    private String loginName;

    private String loginPassword;

    private String picture;

    private Date created;

    private Date updated;

}
