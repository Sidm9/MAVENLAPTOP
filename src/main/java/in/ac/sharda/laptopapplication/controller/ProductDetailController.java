package in.ac.sharda.laptopapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ac.sharda.laptopapplication.domain.Product;
import in.ac.sharda.laptopapplication.service.ProductService;

@RestController
public class ProductDetailController {
	@Autowired
	private ProductService productService;

	@GetMapping("/product/detail/{id}")
	public Product detail(@PathVariable("id") int id) {
		return productService.getProductById(id);
	}
}
