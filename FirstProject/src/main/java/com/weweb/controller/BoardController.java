package com.weweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/board/*")
public class BoardController {
	
	@RequestMapping("/shop")
	public String productList() {
		return "board/shop";
	}
}
