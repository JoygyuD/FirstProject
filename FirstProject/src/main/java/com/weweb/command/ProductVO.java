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
		String msg = String.format("[상품번호: %s, 상품명: %s, 카테고리번호: %s, "
				+ "상품가격: %s, 상품재고량: %s, 상품설명: %s, 상품이미지: %s, 상품등록일: %s, 브랜드: %s", 
				this.prodNum, this.prodName, this.cateCode, this.prodPrice, 
				this.prodStock, this.prodDec, this.prodImg, this.prodDate);
		return msg;
	}

}
