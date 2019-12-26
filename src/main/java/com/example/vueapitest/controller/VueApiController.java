package com.example.vueapitest.controller;

import com.example.vueapitest.pojo.vo.ApiResult;
import com.example.vueapitest.service.VueApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/vueapi")
public class VueApiController {

    private VueApiService vueApiService;

    @Autowired
    public void setVueApiService(VueApiService vueApiService) {
        this.vueApiService = vueApiService;
    }

    @RequestMapping("/getTestApi")
    @ResponseBody
    public ApiResult getTestApi()throws Exception{
        ApiResult apiResult = vueApiService.queryAllUser();
        return apiResult;
    }
}
