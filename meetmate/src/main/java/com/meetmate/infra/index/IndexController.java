package com.meetmate.infra.index;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@Autowired
	private IndexService indexService;
	
	@RequestMapping(value="/xdm/v1/infra/index/indexXdmView")
	public String indexXdmView() {
		return "xdm/v1/infra/index/indexXdmView";
	}
	
}
