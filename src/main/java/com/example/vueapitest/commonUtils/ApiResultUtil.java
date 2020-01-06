package com.example.vueapitest.commonUtils;

import com.example.vueapitest.pojo.vo.ApiResult;

import java.util.List;

public class ApiResultUtil {

    /**
     * 操作成功
     * 返回默认状态码
     * 返回默认提示信息
     * 返回操作数据
     * @param objects
     * @return
     */
    public static ApiResult getSuccessResult(List<?> objects){
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(200);
        apiResult.setMessage("操作成功");
        apiResult.setSuccess(true);
        apiResult.setData(objects);
        return apiResult;
    }

    /**
     * 操作成功
     * 返回默认状态码
     * 返回默认提示信息
     * 返回操作数据
     * @param objects
     * @return
     */
    public static ApiResult getSuccessResult(List<?> objects,String Message){
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(200);
        apiResult.setMessage(Message);
        apiResult.setSuccess(true);
        apiResult.setData(objects);
        return apiResult;
    }

    /**
     * 操作失败
     * 返回默认状态码
     * 返回默认提示信息
     * 返回操作数据
     * @param objects
     * @return
     */
    public static ApiResult getErrorResult(){
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(400);
        apiResult.setMessage("操作失败");
        apiResult.setSuccess(false);
        return apiResult;
    }

    /**
     * 操作失败
     * 返回默认状态码
     * 返回自定义提示信息
     * 返回操作数据
     * @param objects
     * @return
     */
    public static ApiResult getErrorResult(String Message,String ){
        ApiResult apiResult = new ApiResult();
        apiResult.setCode(400);
        apiResult.setMessage(Message);
        apiResult.setSuccess(false);
        return apiResult;
    }
}
