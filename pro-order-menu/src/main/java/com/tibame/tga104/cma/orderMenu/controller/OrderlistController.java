package com.tibame.tga104.cma.orderMenu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tibame.tga104.cma.orderMenu.model.OrderlistVO;
import com.tibame.tga104.cma.orderMenu.service.OrderlistService;

@RestController
@RequestMapping("orderlist")
public class OrderlistController {
	@Autowired
	private OrderlistService orderlistService;

	/**
	 * 點餐
	 */
	@PostMapping
	public OrderlistVO insert(@RequestBody OrderlistVO orderlistVO) {
		return orderlistService.addOrder(orderlistVO);
	}

	/**
	 * 調整點餐數量
	 */
	@PutMapping("/{id}")
	public OrderlistVO update(@RequestBody OrderlistVO orderlistVO) {
		Integer orderId = orderlistVO.getOrderId();
		Integer quantity = orderlistVO.getQuantity();
		return orderlistService.updateOrder(orderId, quantity);
	}

	/**
	 * 取消點餐品項
	 */
	@DeleteMapping("/{id}")
	public void delete(@RequestParam("orderId") Integer orderId) {
		orderlistService.deleteOrder(orderId);
	}

	/**
	 * 查詢結帳總價
	 */
	@GetMapping("/total")
	public double getTotalPrice() {
		return orderlistService.getTotalPrice();
	}

}
