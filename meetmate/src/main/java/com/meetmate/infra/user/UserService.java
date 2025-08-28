package com.meetmate.infra.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	List<UserDto> selectList(){
		return userDao.selectList();
	}
	
	public int insert(UserDto userDto) {
		return userDao.insert(userDto);
	}
	
}
