package com.weweb.controller;

import javax.servlet.http.HttpSession;

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
		System.out.println("MemberController => loginSignupPage()");
		return "member/loginSignup";
	}
	
	@RequestMapping("signUp")
	public String signUp(MemberVO vo, RedirectAttributes RA) {
		System.out.println("MemberController => signUp()");
		int result = service.signUp(vo);
		
		return "/";
	}
	
	@RequestMapping("Login")
	public String Login(MemberVO vo, RedirectAttributes RA, HttpSession session) {
		System.out.println("MemberController => Login()");
		MemberVO loginVO = service.login(vo);
		
		if(loginVO == null) {
			RA.addFlashAttribute("msg", "아이디 또는 패스워드를 잘못입력하셨습니다.");
			return "redirect:/member/loginSignup";
		}else {
			session.setAttribute("user_email", loginVO.getEmail());
			session.setAttribute("user_name", loginVO.getName());
		}
		return "redirect:/";
	}
	
	@RequestMapping("logout")
	public String logout(HttpSession session) {
		System.out.println("MemberController => logout()");
		session.invalidate();
		return "redirect:/";
	}
	
	@RequestMapping("mypage")
	public String mypage() {
		return "member/mypage";
	}
}