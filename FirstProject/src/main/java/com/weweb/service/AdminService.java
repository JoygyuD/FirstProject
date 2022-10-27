package com.weweb.service;

import java.util.ArrayList;

import com.weweb.command.CategoryVO;
import com.weweb.command.ProductVO;

public interface AdminService {
	
	public ArrayList<CategoryVO> categoryList();
	public void register(ProductVO vo);
	public ArrayList<ProductVO> adminProdList(ProductVO vo);

}
