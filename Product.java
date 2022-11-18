package com.ProductCRUD;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	String productid;
	String productname;
	String productprice;
	String productquantity;
	String productcategory;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productid, String productname, String productprice, String productquantity,
			String productcategory) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
		this.productquantity = productquantity;
		this.productcategory = productcategory;
	}

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductprice() {
		return productprice;
	}

	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}

	public String getProductquantity() {
		return productquantity;
	}

	public void setProductquantity(String productquantity) {
		this.productquantity = productquantity;
	}

	public String getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productprice=" + productprice
				+ ", productquantity=" + productquantity + ", productcategory=" + productcategory + "]";
	}

}
