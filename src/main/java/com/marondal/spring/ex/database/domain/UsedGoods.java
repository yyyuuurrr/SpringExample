package com.marondal.spring.ex.database.domain;

import java.util.Date;

// used_goods 테이블의 한행의 정보를 정장하기 위한 클래스
// 테이블의 컬럼이름과 일치하는 멤버 변수를 가진 클래스
// Domain
// Entity
public class UsedGoods {
	
	private int id;
	private int sellerId;
	private String title;
	private int price;
	private String description;
	private String image;
	private Date creatdAt;
	private Date updatedAt;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Date getCreatdAt() {
		return creatdAt;
	}
	public void setCreatdAt(Date creatdAt) {
		this.creatdAt = creatdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	

}
