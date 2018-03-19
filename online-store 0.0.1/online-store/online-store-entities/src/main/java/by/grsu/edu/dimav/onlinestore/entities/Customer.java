package by.grsu.edu.dimav.onlinestore.entities;

import java.util.LinkedList;
import java.util.List;

public class Customer extends User {
	private List<Order> orders;
	
	private List<Product> basket;
	
	private Double balance;
	
	private Boolean isBlocked;
	
	public Customer() {
		this.orders = new LinkedList<Order>();
		this.basket = new LinkedList<Product>();
		this.setBlock(false);
		this.balance = 0.0;
	}
	
	public Customer(Customer customer) {
		super(customer);
		this.orders = customer.orders;
		this.basket = customer.basket;
		this.isBlocked = false;
		this.balance = 0.0;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	public void addOrder(Order o) {
		orders.add(o);
	}
	
	public boolean removeOrder(Order o) {
		return orders.remove(o);
	}

	public List<Product> getBasket() {
		return basket;
	}

	public void setBasket(List<Product> basket) {
		this.basket = basket;
	}
	
	public void addProduct(Product p) {
		basket.add(p);
	}
	
	public boolean removeProduct(Product p) {
		return basket.remove(p);
	}
	
	public Boolean isBlocked() {
		return isBlocked;
	}

	public void setBlock(Boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
}
