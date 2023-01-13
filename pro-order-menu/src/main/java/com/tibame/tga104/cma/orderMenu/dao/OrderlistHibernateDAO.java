package com.tibame.tga104.cma.orderMenu.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.tga104.cma.orderMenu.model.OrderlistVO;

@Repository
@Transactional
public class OrderlistHibernateDAO implements OrderlistDAO {
	@PersistenceContext
	private Session session;

	@Override
	public OrderlistVO insert(OrderlistVO orderlistVO) {
		if (session != null) {
			session.persist(orderlistVO);
		}
		return null;
	}

	@Override
	public void delete(Integer orderId) {
		final OrderlistVO orderlistVO = session.get(OrderlistVO.class, orderId);
		session.remove(orderlistVO);
	}

	@Override
	public OrderlistVO update(OrderlistVO orderlistVO) {
		final String hql = "update OrderlistVO " + "set quantity =:quantity " + "where orderId=:orderId";

		session.createQuery(hql)
				.setParameter("quantity", orderlistVO.getQuantity())
				.setParameter("orderId", orderlistVO.getOrderId()).executeUpdate();
		return orderlistVO;
	}

	@Override
	public List<OrderlistVO> getAll() {
		List<OrderlistVO> result = new ArrayList<OrderlistVO>();

		final String hql = "FROM OrderlistVO ORDER BY orderId";
		Query<OrderlistVO> query = session.createQuery(hql, OrderlistVO.class);
		result = query.list();
		if (result != null) {
			return result;
		}
		return null;

	}

	@Override
	public OrderlistVO updateOne(Integer orderId, Integer quantity) {
		final String hql = "update OrderlistVO set quantity =: quantity where orderId=:orderId";

		session.createQuery(hql).setParameter("quantity",quantity).executeUpdate();
		OrderlistVO orderlistVO = null;
		return orderlistVO ;
	}

	@Override
	public OrderlistVO findByPK(Integer orderId) {
		final String hql = "FROM OrderlistVO WHERE orderId = :orderId";
		return session.createQuery(hql, OrderlistVO.class).getSingleResult();
	}

}
