package com.myspace.dynamic_subprocess_kjar;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Product implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String name;
	private java.lang.Integer price;

	public Product() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.Integer getPrice() {
		return this.price;
	}

	public void setPrice(java.lang.Integer price) {
		this.price = price;
	}

	public Product(java.lang.String name, java.lang.Integer price) {
		this.name = name;
		this.price = price;
	}
    
    public String toString() {
        return "Product Name: " + name + "; price: $" + price;
    }
}