package com.online.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.online.model.Authentication;
import com.online.model.Product;
import com.online.service.ProductServiceImpl;

@RestController
@RequestMapping(value = "/shop")
public class ProductController {

	@Autowired
	private ProductServiceImpl productService;

	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	/**
	 * @param Product
	 * @return
	 */
	@PostMapping(value = "/addProduct")
	public void addProductDetails(@RequestBody Product Product) {

		System.out.println("Add Product..." + Product);
		productService.addProduct(Product);

	}

	/**
	 * @return
	 */
	@GetMapping(value = "/product")
	public List<Product> retrieveDetails(@RequestParam String searchTxt) {

		return productService.retrieveProductDetails(searchTxt);

	}
	
	@PostMapping(value = "/prod")
	public List<String> authentication(@RequestBody Authentication authentication) {
		System.out.println("calling authenticatio "+ authentication.getUsername());
		List ls = new ArrayList();
		ls.add("Success");

		return ls;

	}

}
