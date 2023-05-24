package com.selfInterview.dao.user;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.selfInterview.dto.User;

@Repository
public class UserDAO {
	
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	public String idCheck(String id) {
		if(sessionTemplate.selectOne("idCheck",id)!=null) {
			return "N";
		}else {
			return "Y";
		}
	}
}
