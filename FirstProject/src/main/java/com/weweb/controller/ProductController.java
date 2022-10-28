package com.weweb.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.weweb.command.ProductVO;
import com.weweb.service.ProductService;

@Controller
@RequestMapping(value = "/product/*")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@RequestMapping("/shop")
	public String productList(Model model) {
		System.out.println("ProductController => productList()");
		ArrayList<ProductVO> list = service.productList();
		model.addAttribute("list", list);
		return "product/shop";
	}
}
