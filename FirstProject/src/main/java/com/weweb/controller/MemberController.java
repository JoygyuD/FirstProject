package com.weweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.weweb.command.MemberVO;
import com.weweb.service.MemberService;
import com.weweb.service.MemberServiceImpl;

@Controller
@RequestMapping(value="/member/*")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@RequestMapping("loginSignup")
	public String loginSignupPage() {
		System.out.println("MemberController => loginSignupPage() 동작");
		return "member/loginSignup";
	}
	
	@RequestMapping("signUp")
	public String signUp(MemberVO vo, RedirectAttributes RA) {
		System.out.println("MemberController => signUp() 동작");
		int result = service.signUp(vo);
		
		return "redirect: home";
	}
}
