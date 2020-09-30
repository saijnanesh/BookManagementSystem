package com.capgemini.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.main.entites.OrderDetails;
import com.capgemini.main.exception.InvalidOrderIdException;
import com.capgemini.main.exception.NoOrderException;
import com.capgemini.main.service.OrderServiceInterface;



@RestController
@RequestMapping("/order")
@CrossOrigin(value = "http://localhost:4200")
public class OrderController {
	
	@Autowired
	OrderServiceInterface serviceObj;
	
	@GetMapping("/listAllOrders")
	public ResponseEntity<List<OrderDetails>> getProductOrderList() throws NoOrderException {
		List<OrderDetails> list = serviceObj.listAllDetails();
		if(list == null)
		{
			throw new NoOrderException("NO Orders Yet");
		}
		return new ResponseEntity<List<OrderDetails>>(list,HttpStatus.OK);
	}
		
		
	@GetMapping("/getOrderById/{id}")
	public ResponseEntity<OrderDetails> getOrderById(@PathVariable int id) throws InvalidOrderIdException {
		OrderDetails orderList = serviceObj.getOrderById(id);
		if(orderList == null)
		{
			throw new InvalidOrderIdException("Order Id doesnot exist");
		}
		return new ResponseEntity<OrderDetails>(orderList,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteOrderById/{id}")
	public ResponseEntity<String> deleteOrderById(@PathVariable int id) throws InvalidOrderIdException 
	{
		String result=null;
		boolean order = serviceObj.deleteOrderById(id);
		
		if(order)
		{
			result ="order cancelled Successfully";
			return new ResponseEntity<String>(result, HttpStatus.OK);

		}
		else
		{
			result = "OrderId Doesnot exsist";
			throw new InvalidOrderIdException(result);
		}
	}
	
	@PutMapping("/updateOrder/{id}/{status}")
	public ResponseEntity<String> updateOrder(@PathVariable int id , @PathVariable String status) throws InvalidOrderIdException
	{
		boolean flag = serviceObj.updateOrder(id, status);
		String result = null;
		
	
			if(flag)
		{
			result = "DataUpdated Successfully";
			return new ResponseEntity<String>(result, HttpStatus.OK);
		}
		else
		{
			result = "No data exsist or InvalidOrderId";

			throw new InvalidOrderIdException(result);
		}
	}
		
		

}
