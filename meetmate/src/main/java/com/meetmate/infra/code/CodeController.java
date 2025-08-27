package com.meetmate.infra.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {
	
	@Autowired	
	private CodeService	codeService;
	
	@RequestMapping(value= "/xdm/v1/infra/code/codeXdmList")
		public String codeXdmList() {
		return "xdm/v1/infra/code/codeXdmList";
	}
	
}
