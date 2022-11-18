package com.ProductCRUD;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class ProductService {

	@Autowired
	ProductDao dao;
	// @Autowired
	// ProductController pd;

	public ArrayList<Product> getdatafromdao() {

		ArrayList<Product> product = dao.getDataformDB();
		System.out.println("i am in service");
		return product;

	}

	public Product getdatafromdao(String productid) {

		Product product = null;

		if (productid.equals("productid")) {
			product = dao.getDataformDB(productid);

		}

		product = dao.getDataformDB(productid);

		System.out.println("i am in service");
		return product;

	}

	public List<Product> addproduct(Product product) {

		System.out.println(product);
		return dao.addproduct(product);

	}

	public List<Product> updateproduct(Product product) {

		return dao.updateproduct(product);

	}

	public List<Product> deletebookdata(String productid) {
		return dao.deleterecord(productid);

	}

}
