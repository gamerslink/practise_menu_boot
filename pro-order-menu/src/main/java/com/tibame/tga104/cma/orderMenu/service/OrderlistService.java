package com.tibame.tga104.cma.orderMenu.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.tga104.cma.orderMenu.dao.OrderItemRepository;
import com.tibame.tga104.cma.orderMenu.dao.OrderlistDAO;
import com.tibame.tga104.cma.orderMenu.model.OrderlistVO;

@Service
@Transactional
public class OrderlistService {
	@Autowired
	private OrderlistDAO dao;
	@Autowired
	private OrderItemRepository orderItemRepository;

	public OrderlistVO addOrder(OrderlistVO orderlistVO) {
		if (orderlistVO.getQuantity() != null) {
			return dao.insert(orderlistVO);
		}
		return null;
	}

	public void deleteOrder(Integer OrderId) {
		dao.delete(OrderId);
	}


	public OrderlistVO updateOrder(Integer orderId, Integer quantity) {
		OrderlistVO result = dao.findByPK(orderId);
		if (result != null) {
			return dao.updateOne(orderId, quantity);
		}
		return null;
	}

	public double getTotalPrice() {
		List<OrderlistVO> orderItems = orderItemRepository.findAll();
		double totalPrice = 0;
		for (OrderlistVO orderItem : orderItems) {
			totalPrice += orderItem.getQuantity() * orderItem.getPrice();
		}
		return totalPrice;
	}


}
