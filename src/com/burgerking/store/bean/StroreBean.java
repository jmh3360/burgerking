package com.burgerking.store.bean;

public class StroreBean {
	private String price, food;
	private boolean takeout;
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public boolean isTakeout() {
		return takeout;
	}
	public void setTakeout(boolean takeout) {
		this.takeout = takeout;
	}
	
	@Override
	public String toString() {
		return "StroreBean [price=" + price + ", food=" + food + ", takeout=" + takeout + "]";
	}
}
