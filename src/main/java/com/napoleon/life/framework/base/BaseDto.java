package com.napoleon.life.framework.base;

import java.sql.Timestamp;

import com.napoleon.life.common.util.validator.Validator;
import com.napoleon.life.framework.enums.LoginSourceEnum;

public class BaseDto {

	private String userNo;
	
	private String userName;
	
	private String phone;
	
	private String email;
	
	private String sex;
	
	private Integer height;
	
	private Timestamp birthday;

	/**
	 * 登陆来源
	 */
	@Validator(desc = "来源", enumScope = LoginSourceEnum.class, nullable = false)
	private String source;
	
	private String access_token;

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Timestamp getBirthday() {
		return birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}
}
