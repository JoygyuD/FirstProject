package com.weweb.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryVO {
	
	private String cateName;
	private int cateCode;
	private int cateCodeRef;
	private int level; 
	
	@Override
	public String toString() {
		String msg = String.format("[카테고리 이름: %s, 카테고리 코드: %s, 참조 카테고리 코드: %s", 
				this.cateName, this.cateCode, this.cateCodeRef);
		return msg;
	}
}
