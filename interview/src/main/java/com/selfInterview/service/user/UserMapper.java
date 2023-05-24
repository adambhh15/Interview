package com.selfInterview.service.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.selfInterview.dto.User;

@Mapper
public interface UserMapper {

	@Select("select id from user where id=#{id}")
	public String idCheck(String id);
}
