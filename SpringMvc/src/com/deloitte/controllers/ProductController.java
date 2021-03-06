package com.deloitte.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.prod.Product;

@Controller
public class ProductController {

	Product product = new Product(50, "Bharath", 50000);

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public ModelAndView product() {
		return new ModelAndView("Product", "command", product);
	}

	@RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("SpringWeb") Product product, ModelMap model) {
		model.addAttribute("name", product.getName());
		model.addAttribute("price", product.getPrice());
		model.addAttribute("id", product.getId());
		return "result";
	}
}
