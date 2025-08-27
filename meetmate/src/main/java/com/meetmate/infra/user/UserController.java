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
	
	@RequestMapping(value="/xdm/v1/infra/user/userXdmList")
	public String user(Model model) {
		List<UserDto> users = userService.selectList();
		model.addAttribute("lists",users); 
		return "xdm/v1/infra/user/userXdmList";
	}
	
	@RequestMapping(value="/xdm/v1/infra/user/userXdmForm")
	public String userXdmForm() {
		return "xdm/v1/infra/user/userXdmForm";
	}
	
	@RequestMapping(value="/xdm/v1/infra/user/userXdmMfom")
	public String userXdmMfom() {
		return "xdm/v1/infra/user/userXdmMfom";
	}
	
	
	
}
