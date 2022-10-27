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
		System.out.println("MemberServiceImpl => signUp()");
		int result = mapper.signUp(vo);
		return result;
	}
	// 로그인
	@Override
	public MemberVO login(MemberVO vo) {
		System.out.println("MemberServiceImpl => login()");
		MemberVO loginVO = mapper.login(vo);
		return loginVO;
	}
	@Override
	public int emailCheck(String email) {
		System.out.println("MemberServiceImpl => emailCheck()");
		int result = mapper.emailCheck(email);
		return result;
	}
	
	@Override
	public int newPassWord(MemberVO vo) {
		int result = mapper.newPassWord(vo);
		return result;
	}
	
	@Override
	public int deleteMember(MemberVO vo) {
		int result = mapper.deleteMember(vo);
		return result;
	}

}
