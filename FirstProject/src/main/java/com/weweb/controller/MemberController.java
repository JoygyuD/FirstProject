package com.weweb.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@ComponentScan(value = "")
public class MemberController {
	
	@RequestMapping("loginSignup")
	public String login() {
		return "loginSignup";
	}
}
