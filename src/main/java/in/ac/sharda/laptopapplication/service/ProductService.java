package in.ac.sharda.laptopapplication.service;

import java.util.Collection;

import in.ac.sharda.laptopapplication.domain.Product;

public interface ProductService {
	Product getProductById(int id);

	Collection<Product> getProducts();
}
