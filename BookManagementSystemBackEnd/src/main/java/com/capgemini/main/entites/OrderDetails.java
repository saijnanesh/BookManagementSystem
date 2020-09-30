package com.capgemini.main.entites;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;


	
	

@Entity
@Table(name = "ORDERDETAILENTITY")
public class OrderDetails {
	
	
	
	@Id
	private int orderId;
	
	@Column(name = "BookCopies")
	private int bookCopies;
	
	@Column(name = "OrderedBy")
	private String orderedBy;
	
	@Column(name = "PaymentMethod")
	private String paymentMethod;
	
	@Column(name = "Status")
	private String status;
	
	@Column(name ="Total")
	private double total;
	
	@Column(name = "OrderDate")
	private LocalDate orderDate;
	
	@Column(name = "ExpectedDateOfDelivery")
	private LocalDate expectedDateOfDelivery;
	
	
	
	
	
	
	
	
	
	

	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetails(int orderId, int bookCopies, String orderedBy, String paymentMethod, String status,
			double total, LocalDate orderDate, LocalDate expectedDateOfDelivery) {
		super();
		this.orderId = orderId;
		this.bookCopies = bookCopies;
		this.orderedBy = orderedBy;
		this.paymentMethod = paymentMethod;
		this.status = status;
		this.total = total;
		this.orderDate = orderDate;
		this.expectedDateOfDelivery = expectedDateOfDelivery;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getBookCopies() {
		return bookCopies;
	}

	public void setBookCopies(int bookCopies) {
		this.bookCopies = bookCopies;
	}

	public String getOrderedBy() {
		return orderedBy;
	}

	public void setOrderedBy(String orderedBy) {
		this.orderedBy = orderedBy;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public LocalDate getExpectedDateOfDelivery() {
		return expectedDateOfDelivery;
	}

	public void setExpectedDateOfDelivery(LocalDate expectedDateOfDelivery) {
		this.expectedDateOfDelivery = expectedDateOfDelivery;
	}
	
	
	



}
