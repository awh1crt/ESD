package com.bolton.esdgrocerystore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bolton.esdgrocerystore.models.Product;
import com.bolton.esdgrocerystore.services.ProductService;

@Controller
@SessionAttributes("products")
public class ProductController {
	@Autowired
	ProductService productService;
	
	@GetMapping("/addProduct")
	public String addProductPage() {
		return "addProduct";
	}
	
	@RequestMapping("/addProduct")
	public String addProduct (@RequestParam String productName, @RequestParam String productDescription, @RequestParam Double productPrice, @RequestParam int productStock) {
		
		Product product = new Product(productName,productDescription,productPrice, productStock);
		productService.addProduct(product);
		return "addProduct";
		
	}
	@RequestMapping(value = "/selectProduct", method = { RequestMethod.GET})
	public String selectProduct(@RequestParam int id, ModelMap model) {
		Product productFound = productService.findProductById(id);
		model.put("product", productFound);
		
		
		return "/selectProduct";
		
	}
	@RequestMapping(value = "/searchProduct")
	public String searchProduct(@RequestParam String sName, ModelMap model) {
		Iterable<Product> productFound = productService.findByProductName(sName);
		model.put("product", productFound);
		
		return "/selectProduct";
		
	}
	
	@GetMapping("/deleteProduct")
	public String deleteProduct(@RequestParam int id) {
		//productService.deleteById(id);
		return "/deleteProduct";
	}
	
	@GetMapping("/reallyDelete")
	public String reallyDelete(@RequestParam int id) {
		productService.deleteById(id);
		return "redirect:/productDetails";
	}
	
	
	@GetMapping("/productDetails")
	public String productDetails(ModelMap map) {
		map.put("products", productService.showAllProducts());
		return "productDetails";
	}
	@GetMapping("/buyProduct")
	public String buyProduct(@RequestParam int id) {
		return null;
		
	}

}
