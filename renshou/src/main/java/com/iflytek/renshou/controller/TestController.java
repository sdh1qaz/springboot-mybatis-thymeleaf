package com.iflytek.renshou.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.iflytek.renshou.dao.TokenMapper;
import com.iflytek.renshou.pojo.Token;

/**
 * 重定向到页面
 */
@Controller
public class TestController {
	
	@Autowired
	private TokenMapper tokenDao;
	
	@RequestMapping("/test")
	public String test(HttpServletRequest request) {
		request.setAttribute("user", "苏登辉");
		return "test";
	}
	
	@RequestMapping("/insertOrUpdateToken")
	@ResponseBody
	public Integer insertOrUpdateToken(@RequestBody Token token) {
		return tokenDao.insertOrUpdateToken(token);
	}
	
	
	
}
