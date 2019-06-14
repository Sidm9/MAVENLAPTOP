package in.ac.sharda.laptopapplication.service;

import java.util.Collection;
import java.util.Map;

import org.springframework.stereotype.Service;

import in.ac.sharda.laptopapplication.data.Products;
import in.ac.sharda.laptopapplication.domain.Product;

@Service
public class ProductServiceImpl 
				implements ProductService{
	private Map<Integer,Product>
			products = Products
			.getInstance().getProducts();
	
	public Product getProductById(int id){
		return products.get(id);
	}

	@Override
	public Collection<Product> getProducts() {
		return products.values();
	}
	
	
}
