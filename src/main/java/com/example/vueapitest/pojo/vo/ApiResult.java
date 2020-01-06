package com.example.vueapitest.pojo.vo;

import lombok.Data;

import java.util.List;

@Data
public class ApiResult {

    public Integer code;

    public String message;

    public Boolean success;

    public List<?> data;

}
