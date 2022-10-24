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

}
