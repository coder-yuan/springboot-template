package com.example.vueapitest.service;


import com.example.vueapitest.commonUtils.ApiResultUtil;
import com.example.vueapitest.mapper.SysUserMapper;
import com.example.vueapitest.mapper.jpa.SysUserJPA;
import com.example.vueapitest.pojo.vo.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VueApiService {

    private SysUserMapper sysUserMapper;

    private SysUserJPA sysUserJPA;

    @Autowired
    public  void setSysUserMapper(SysUserMapper sysUserMapper){
        this.sysUserMapper = sysUserMapper;
    }

    @Autowired
    public void setSysUserJPA(SysUserJPA sysUserJPA) {
        this.sysUserJPA = sysUserJPA;
    }




    public ApiResult queryAllUser() {
        try {
            return ApiResultUtil.getSuccessResult(sysUserJPA.findAll());
        } catch (Exception e) {
            return ApiResultUtil.getErrorResult();
        }
    }


}
