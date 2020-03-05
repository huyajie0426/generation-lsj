package com.lsj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class TbUserController {
	
	@RequestMapping(value="/index")
	public String goIndex() {
		return "index";
	}
	
}
