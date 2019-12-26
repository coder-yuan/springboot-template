package com.example.vueapitest.commonUtils;

import com.example.vueapitest.pojo.vo.ApiResult;

import java.util.List;

public class ApiResultUtil {

    public static ApiResult getSuccessResult(List<?> objects){
        ApiResult apiResult = new ApiResult();
        apiResult.setCode("200");
        apiResult.setMessage("操作成功");
        apiResult.setSuccess(true);
        apiResult.setData(objects);
        return apiResult;
    }

    public static ApiResult getErrorResult(){
        ApiResult apiResult = new ApiResult();
        apiResult.setCode("400");
        apiResult.setMessage("操作失败");
        apiResult.setSuccess(false);
        return apiResult;
    }
}
