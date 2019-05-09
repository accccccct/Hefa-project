/*******************************************************************************
 * Project Key : CPPII
 * Create on 2018年10月18日 下午3:23:27
 * Copyright (c) 2018. 爱智造.
 * 注意：本内容仅限于爱智造内部传阅，禁止外泄以及用于其他的商业目的
 ******************************************************************************/

package com.hefa.client.util;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSONObject;
import com.hefa.common.constants.ClientConstants;
import com.hefa.pojo.vo.LoginUserInfo;
import com.hefa.utils.AesUtils;

/**
 * <P>
 * TODO
 * </P>
 * 
 * @version 1.0
 * @author 黄智聪 2018年10月18日 下午3:23:27
 */
public class WebUtils {

	/**
	 * 
	 * <p>获取用户信息</p>
	 * @param request
	 * @return
	 * @throws Exception
	 * @author 黄智聪  2019年5月9日 下午2:44:04
	 */
	public static LoginUserInfo getLoginUser() {
		HttpServletRequest request = getHttpServletRequest();
		String token = request.getHeader("token");
		String userInfoJsonStr = AesUtils.decrypt(token, ClientConstants.DEFAULT_DES_KEY);;
		LoginUserInfo userInfo = JSONObject.parseObject(userInfoJsonStr, LoginUserInfo.class);
		return userInfo;
	}
	
	public static HttpServletRequest getHttpServletRequest() {
		ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
	    HttpServletRequest request = servletRequestAttributes.getRequest();
	    return request;
	}

}