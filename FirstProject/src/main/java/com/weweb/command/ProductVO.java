package com.weweb.command;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductVO {
	
	private int prodNum;
	private String prodName;
	private int cateCode;
	private int prodPrice;
	private int prodStock;
	private String prodDec;
	private String prodImg;
	private Timestamp prodDate;
	
	@Override
	public String toString() {
		
		return "[상품번호: "+this.prodNum+", 상품명: "+this.prodName+", 카테고리번호: "+this.cateCode+", 상품가격: "
		+this.prodPrice+", 상품재고량: "+this.prodStock+", 상품설명: "+this.prodDec+", 상품이미지: "+this.prodImg+", 상품등록일: "+this.prodDate+"]";
	}

}
