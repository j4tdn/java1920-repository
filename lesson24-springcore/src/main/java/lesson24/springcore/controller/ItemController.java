package lesson24.springcore.controller;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import lesson24.springcore.service.ItemService;

@Controller
@Scope(SCOPE_SINGLETON)
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	public void viewHomePage() {
		System.out.println("=== homepage ===");
		itemService.getAll()
			.forEach(System.out::println);
	}
	
}
