package com.weweb.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weweb.command.CategoryVO;
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
	
	@RequestMapping(value="/register")
	public void prodRegister(Model model) {
		System.out.println("AdminController => prodRegister()");
		ArrayList<CategoryVO> list = service.categoryList();
		model.addAttribute("category", JSONArray.fromObject(list));
	}
}
