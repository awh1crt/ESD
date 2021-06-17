package com.bolton.esdgrocerystore.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CartItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartItemId;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserRegister customer;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	
	private int quantity;
	
	public CartItem (int quantity, UserRegister customer, Product product) {
		super();
		this.quantity=quantity;
		this.customer=customer;
		this.product=product;
	}
	public CartItem() {
		super();
	}

	
	
	public UserRegister getCustomer() {
		return customer;
	}

	public void setCustomer(UserRegister customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}
	@Override
	public String toString() {
		return "CartItem [cartItemId=" + cartItemId + ", customer=" + customer + ", product=" + product + ", quantity="
				+ quantity + "]";
	}

	
}
