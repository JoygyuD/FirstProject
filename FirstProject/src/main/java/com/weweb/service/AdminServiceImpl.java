package com.weweb.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weweb.command.CategoryVO;
import com.weweb.command.ProductVO;
import com.weweb.mapper.AdminMapper;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminMapper mapper;
	
	@Override
	public ArrayList<CategoryVO> categoryList() {
		System.out.println("AdminService => categoryList()");
		ArrayList<CategoryVO> list = mapper.categoryList();
		return list;
	}
	
	@Override
	public void register(ProductVO vo) {
		mapper.register(vo);
		
	}
	
	@Override
	public ArrayList<ProductVO> adminProdList(ProductVO vo) {
		ArrayList<ProductVO> list =  mapper.adminProdList(vo);
		return list;
	}

}
