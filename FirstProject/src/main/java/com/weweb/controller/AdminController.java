package com.weweb.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.weweb.command.CategoryVO;
import com.weweb.command.ProductVO;
import com.weweb.service.AdminService;

import net.sf.json.JSONArray;

@Controller
@RequestMapping(value="/admin/*")
public class AdminController {
	
	@Autowired
	private AdminService service;
	
	@RequestMapping(value="/adminpage")
	public String adminpage() {
		System.out.println("AdminController => adminpage()");
		return "admin/adminpage";
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String postProductRegister(ProductVO vo) {
		service.register(vo);
		
		return "redirect:/admin/adminpage";
	}
	
	@RequestMapping(value="/register")
	public void categoryList(Model model) {
		System.out.println("AdminController => prodRegister()");
		ArrayList<CategoryVO> list = service.categoryList();
		model.addAttribute("category", JSONArray.fromObject(list));
	}
	
	@RequestMapping("/adminprodlist")
	public String adminProdList(ProductVO vo,Model model) {
		System.out.println("ProductController => adminProdlist()");
		ArrayList<ProductVO> list = service.adminProdList(vo);
		model.addAttribute("list", list); 
		return "admin/adminprodlist";
	}
}
