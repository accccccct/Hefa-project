/*******************************************************************************
 * Project Key : CPPII
 * Create on 2018年10月15日 上午9:18:34
 * Copyright (c) 2018. 爱智造.
 * 注意：本内容仅限于爱智造内部传阅，禁止外泄以及用于其他的商业目的
 ******************************************************************************/
package com.hefa.common.errorcode;

import com.hefa.common.base.BaseErrorCode;

/**
 * <P>系统错误码</P>
 * @version 1.0
 * @author 黄智聪（13510946256）  2018年8月29日 下午5:32:33
 */
public class ApiSignErrorCode extends BaseErrorCode {
    
	/**
	 * 无效签名
	 */
	public static final ApiSignErrorCode API_SIGN_ERROR_INVALID_SIGNATURE = new ApiSignErrorCode(60000, "无效签名");
	
	/**
	 * 接口调用已超时
	 */
	public static final ApiSignErrorCode API_SIGN_ERROR_REQUEST_TIMEOUT = new ApiSignErrorCode(60001, "接口调用已超时");
	
	/**
	 * 无效时间戳
	 */
	public static final ApiSignErrorCode API_SIGN_ERROR_INVALID_TIMESTAMP = new ApiSignErrorCode(60002, "无效时间戳");
	
	/**
	 * 缺少验签参数
	 */
	public static final ApiSignErrorCode API_SIGN_ERROR_MISSING_SIGNATURE_PARAM = new ApiSignErrorCode(60003, "缺少验签参数");
    
	public ApiSignErrorCode(int code, String message) {
        super(code, message);
    }

    @Override
    public String getErrorType() {
        return "API签名异常";
    }
}

