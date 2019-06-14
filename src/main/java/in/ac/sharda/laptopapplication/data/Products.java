package in.ac.sharda.laptopapplication.data;

import java.util.HashMap;
import java.util.Map;

import in.ac.sharda.laptopapplication.domain.Product;

public class Products {
	private Map<Integer, Product> products = new HashMap<>();
	private static final Products instance = new Products();

	private Products() {

		products.put(1801,new Product(1801,142990,"ROG STRX SCAR 2","i7 8750H Processer 16GB RAM GTX 1060 6GB VRAM"));
		products.put(1802,new Product(1802,299990,"ROG ZEYPHRUS M","i7 8750H Processer 16GB RAM GTX 1080 8GB VRAM"));
		products.put(1803,new Product(1803,305246,"MSI GT75 TITAN ","i9-9980HK Processer 32GB RAM RTX 2070 8GB VRAM"));
		products.put(1804,new Product(1804,303590,"ALIENWARE AREA 51M","i9-9980HK Processer 32GB RAM RTX 2080 8GB VRAM"));
		products.put(1805,new Product(1805,230000,"RAZOR BLADE PRO 17","i7-87500H Processer 16GB RAM RTX 2070 8GB VRAM"));
		products.put(1806,new Product(1806,117900,"ACER PREDATOR TRITON 500","i7 8750H Processer 16GB RAM RTX 2080 8GB VRAM"));
		products.put(1807,new Product(1807,175000,"ALIENWARE AREA M15","i7 8750H Processer 16GB RAM GTX 1070 8GB VRAM"));
		products.put(1808,new Product(1808,245000,"MSI GT75 TITAN 8RG ","i9-8950HK Processer 32GB RAM GTX 1080 8GB VRAM"));
		products.put(1809,new Product(1809,230000,"LENOVO LEGION Y740","i7 8750H Processer 32GB RAM RTX 2080 8GB VRAM"));
		}

	public static Products getInstance() {
		return instance;
	}

	public Map<Integer, Product> getProducts() {
		return products;
	}

}
