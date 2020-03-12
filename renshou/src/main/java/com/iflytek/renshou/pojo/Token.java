package com.iflytek.renshou.pojo;

import java.io.Serializable;
import java.util.Date;

public class Token implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9218789890374095914L;
	private int id;
	private String accessToken;
	private Date creatTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public Date getCreatTime() {
		return creatTime;
	}
	public void setCreatTime(Date creatTime) {
		this.creatTime = creatTime;
	}
	
	

}
