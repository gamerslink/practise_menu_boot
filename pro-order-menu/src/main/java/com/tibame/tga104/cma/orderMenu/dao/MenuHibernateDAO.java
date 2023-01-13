package com.tibame.tga104.cma.orderMenu.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tibame.tga104.cma.orderMenu.model.MenuVO;

@Repository
@Transactional
public class MenuHibernateDAO implements MenuDAO {

	@PersistenceContext
	private Session session;

	@Override
	public List<MenuVO> getAll() {
		List<MenuVO> result = new ArrayList<MenuVO>();

		final String hql = "FROM MenuVO ORDER BY menuId";
		Query<MenuVO> query = session.createQuery(hql, MenuVO.class);
		result = query.list();
		if (result != null) {
			return result;
		}
		return null;

	}

}
