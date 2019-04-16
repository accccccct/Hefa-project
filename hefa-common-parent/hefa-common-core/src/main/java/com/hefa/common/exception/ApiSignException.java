/*******************************************************************************
 * Project Key : CPPII
 * Create on 2019年4月15日 下午3:38:16
 * Copyright (c) 2018. 爱智造.
 * 注意：本内容仅限于爱智造内部传阅，禁止外泄以及用于其他的商业目的
 ******************************************************************************/
 
package com.hefa.common.exception;

import com.hefa.common.base.BaseException;
import com.hefa.common.errorcode.ApiSignErrorCode;

/**
 * <P>TODO</P>
 * @version 1.0
 * @author 黄智聪  2019年4月15日 下午3:38:16
 */
public class ApiSignException extends BaseException {

	private static final long serialVersionUID = 1L;

	public ApiSignException(ApiSignErrorCode errorCode) {
		super(errorCode);
	}
	
}

