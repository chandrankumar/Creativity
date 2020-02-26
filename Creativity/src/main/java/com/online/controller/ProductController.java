package com.online.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.online.model.Product;
import com.online.service.ProductServiceImpl;

@Controller
@RequestMapping(value = "/shop")
public class ProductController {

	@Autowired
	private ProductServiceImpl productService;

	@RequestMapping("/home")
	public String home() {
		return "index";
	}

	/**
	 * @param Product
	 * @return
	 */
	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public @ResponseBody void addProductDetails(@RequestBody Product Product) {

		System.out.println("Add Product..." + Product);
		productService.addProduct(Product);

	}

	/**
	 * @return
	 */
	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public @ResponseBody List<Product> retrieveDetails() {

		return productService.retrieveProductDetails();

	}

}
