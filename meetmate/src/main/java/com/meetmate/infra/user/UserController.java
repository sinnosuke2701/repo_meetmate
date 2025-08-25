package com.meetmate.infra.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/usr/v1/infra/user/user")
	public String user(Model model) {
		List<UserDto> users = userService.selectList();
		model.addAttribute("lists",users); 
		return "usr/v1/infra/user/user";
	}
}
