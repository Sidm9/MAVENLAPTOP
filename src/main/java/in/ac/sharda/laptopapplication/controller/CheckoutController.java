package in.ac.sharda.laptopapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ac.sharda.laptopapplication.domain.Cart;
import in.ac.sharda.laptopapplication.domain.User;

@RestController
public class CheckoutController {

	@GetMapping("/checkout")
	public boolean checkout(){
		// 1. Add the items from cart to the order status 
		User.getInstance()
			.addOrderStatus(
				Cart.getInstance().getProducts());
		// 2. remove the items from cart - clear the cart 
		Cart.getInstance().clear();
		return true;
	}
}
