package com.weweb.mapper;

import java.util.ArrayList;

import com.weweb.command.CategoryVO;
import com.weweb.command.ProductVO;

public interface AdminMapper {
	
	public ArrayList<CategoryVO> categoryList();
	public void register(ProductVO vo);
	public ArrayList<ProductVO> adminProdList(ProductVO vo);

}
