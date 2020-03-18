package com.online.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.online.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	EntityManager entityManager;

	@Override
	@Transactional
	public void addProduct(Product product) {
		entityManager.merge(product);
	}

	public List<Product> retrieveProductDetails(String searchTxt) {

		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Product> criteriaQuery = builder.createQuery(Product.class);
		Root<Product> root = criteriaQuery.from(Product.class);
		criteriaQuery.select(root);
		if(StringUtils.isNoneEmpty(searchTxt)) {
			criteriaQuery.where(builder.like(root.get("brandName"),"%"+searchTxt+"%"));
		}
		TypedQuery<Product> query = entityManager.createQuery(criteriaQuery);
		List<Product> resultList = query.getResultList();
		return resultList;
	}

}
