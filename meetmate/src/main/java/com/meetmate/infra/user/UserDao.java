package com.meetmate.infra.user;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
	
	List<UserDto> selectList();
	
	public int insert(UserDto userDto);
	
}
