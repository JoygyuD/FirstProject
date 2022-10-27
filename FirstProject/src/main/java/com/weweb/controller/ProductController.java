package com.weweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.weweb.command.ProductVO;

@Controller
@RequestMapping(value = "/product/*")
public class ProductController {
	
	@RequestMapping("/shop")
	public String productList() {
		return "product/shop";
	}
	
	@RequestMapping("/adminprodlist")
	public String adminProdList(ProductVO vo) {
		System.out.println("ProductController => adminProdlist()");
		return "product/adminprodlist";
	}
}
