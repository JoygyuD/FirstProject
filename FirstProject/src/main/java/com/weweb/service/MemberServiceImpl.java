package com.weweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weweb.command.MemberVO;
import com.weweb.mapper.MemberMapper;

@Service("memberService")
public class MemberServiceImpl implements MemberService{
	
	// Mapper객체 선언
	@Autowired
	private MemberMapper mapper;
	
	// 회원가입
	@Override
	public int signUp(MemberVO vo) {
		System.out.println("MemberServiceImpl => signUp() 동작");
		int result = mapper.signUp(vo);
		return result;
	}
	// 로그인
	@Override
	public int login(MemberVO vo) {
		System.out.println("Login = > 동작Service");
		int result = mapper.login(vo);
		return result;
	}
	
	@Override
	public int emailCheck(String email) {
		int result = mapper.emailCheck(email);
		System.out.println("이메일 개수 : "+result);
		return result;
	}
}
