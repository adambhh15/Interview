package com.selfInterview.service.user;

import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.selfInterview.dto.SessionUser;
import com.selfInterview.dto.User;

@Mapper
public interface UserMapper {

	@Select("select id from user where id=#{id}")
	public String idCheck(String id);
	
	@Insert("insert into user values(#{name},#{email},#{picture})")
	public SessionUser insertGoogle(SessionUser user);
}
