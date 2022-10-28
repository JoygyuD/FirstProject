package com.weweb.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weweb.command.ProductVO;
import com.weweb.mapper.ProductMapper;

@Service("ProductService")
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductMapper mapper;
	
	@Override
	public ArrayList<ProductVO> productList() {
		System.out.println("ProductService => productList()");
		ArrayList<ProductVO> list =  mapper.productList();
		return list;
	}
	

}
