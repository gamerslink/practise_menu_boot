package com.tibame.tga104.cma.orderMenu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderList")
public class OrderlistVO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orderId")
	private Integer orderId;

	@Column(name = "menuId")
	private Integer menuId;
	@Column(name = "menuName")
	private String menuName;
	@Column(name = "quantity")
	private Integer quantity;
	@Column(name = "price")
	private Integer price;
	@Column(name = "totalPrice")
	private Integer totalPrice;

	@Override
	public String toString() {
		return "OrderlistVO [orderId=" + orderId + ", menuId=" + menuId + ", menuName=" + menuName + ", quantity="
				+ quantity + ", price=" + price + ", totalPrice=" + totalPrice + "]";
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

}
