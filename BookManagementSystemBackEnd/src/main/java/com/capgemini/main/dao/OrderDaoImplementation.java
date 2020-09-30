package com.capgemini.main.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.main.entites.OrderDetails;
import com.capgemini.main.exception.NoOrderException;

@Repository
@Transactional
public class OrderDaoImplementation  implements OrderDaoInterface{

	@PersistenceContext
	EntityManager entityManager;
	
	static final String statusUpdate1 = "Dispatched";
	static final String statusUpdate2 = "Delivered";
	static final String statusUpdate3 = "Picked";
	static final String statusUpdate4 = "Destination Reached";
	static final String statusUpdate5 = "Pending";
	
	
	@Override
	public List<OrderDetails> listAllOrders(){
		String Qstr="SELECT order from OrderDetails order";
		TypedQuery<OrderDetails> query=entityManager.createQuery(Qstr,OrderDetails.class);
		List list =  query.getResultList();
		if(list.isEmpty())
		{
			return null;
		}
		else
		{
		return list;
	}}

	@Override
	public OrderDetails getOrderById(int id) {
		OrderDetails order = entityManager.find(OrderDetails.class, id);
		if(order!=null )
		 {
			 return order; 
		 }
		return null;
	}

	@Override
	public boolean deleteOrderById(int id) 
	{
		OrderDetails order = entityManager.find(OrderDetails.class,id);
		if(order != null  )
			{
			entityManager.remove(order);
			return true;
			}
		else
			{
			return false;
		}
	}

	@Override
	public boolean updateOrder(int id, String status) {
		
		OrderDetails order  = entityManager.find(OrderDetails.class, id);
		if(order!=null && (status.contentEquals(statusUpdate1) || status.contentEquals(statusUpdate2) ||
				status.contentEquals(statusUpdate3) || status.contentEquals(statusUpdate4)
				||status.contentEquals(statusUpdate5)) )
		{
			order.setStatus(status);
			return true;
		}
		else
		{
			return false;
		}
		
	}
	

}
