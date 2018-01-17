package com.napoleon.life.framework.code;

import com.napoleon.life.exception.ModelCodeInterface;


public enum FrameworkModelCode implements ModelCodeInterface {
	
	FRAMEWORK_SYSTEM_ERROR("FRAMEWORK-0001", "SYSTEM_ERROR", "系统异常"),
	FRAMEWORK_PARAMS_WRONG("FRAMEWORK-0002", "PARAMS_WRONG", "请求参数错误"),
	FRAMEWORK_REDIS_OPERATION_EXCEPTION("FRAMEWORK-0003", "REDIS_OPERATION_EXCEPTION", "缓存操作异常"),
	FRAMEWORK_ACCESS_TOKEN_EXPIRED("FRAMEWORK-0004", "ACCESS_TOKEN_EXPIRED", "access_token已经失效，请重新登陆"),
	;
	
	private final String code;
	private final String message;
	private final String chineseMessage;
	
	private FrameworkModelCode(String code, String message, String chineseMessage){
		this.code = code;
		this.message = message;
		this.chineseMessage = chineseMessage;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public String getChineseMessage() {
		return chineseMessage;
	}
}
