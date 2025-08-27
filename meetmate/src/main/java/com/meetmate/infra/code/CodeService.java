package com.meetmate.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeService {
		
	@Autowired
	private CodeDao codeDao;
	
	List<CodeDto> selectList(){
		return codeDao.selectList();
	}
	
}
