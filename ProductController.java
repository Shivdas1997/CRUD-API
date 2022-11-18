package com.ProductCRUD;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	ProductService service;

	@GetMapping("showproduct")
	public ArrayList<Product> showproduct() {
		System.out.println("hello");
		ArrayList<Product> product = service.getdatafromdao();
		return product;

	}

	@GetMapping("showproduct/{productid}")
	public Product show(@PathVariable String productid) {
		System.out.println("hello");

		Product product = service.getdatafromdao(productid);
		System.out.println(product);

		return product;

	}

	// insert data
	@PostMapping("add")
	public List<Product> add(@RequestBody Product product) {
		System.out.println(product);
		return service.addproduct(product);

	}

	// update product record
	@PutMapping("update/{productid}")
	public List<Product> updateproduct(@RequestBody Product product) {

		return service.updateproduct(product);

	}

	@DeleteMapping("delete/{productid}")
	public List<Product> deletebook(@PathVariable String productid) {

		return service.deletebookdata(productid);

	}

}
