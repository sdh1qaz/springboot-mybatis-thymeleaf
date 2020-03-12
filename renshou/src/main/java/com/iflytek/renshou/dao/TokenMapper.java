package com.iflytek.renshou.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.iflytek.renshou.pojo.Token;

/**
 * UserVo操作接口
 * @author 苏登辉
 */
@Component
public interface TokenMapper {
	
	/**
	 * 增/改
	 */
	int insertOrUpdateToken(@Param("token")Token token);
	
}