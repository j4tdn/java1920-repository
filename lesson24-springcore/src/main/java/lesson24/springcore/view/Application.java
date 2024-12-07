package lesson24.springcore.view;

import static lesson24.springcore.utils.Constants.SPRING_BEANS_CONFIGURATION_PATH;

import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import lesson24.springcore.bean.Item;
import lesson24.springcore.bean.ItemGroup;
import lesson24.springcore.service.ClientService;

public class Application {
	
	public static void main(String[] args) {
		
		// Step 3: Configure, Assemble beans from metadata with IOC container
		var context = new ClassPathXmlApplicationContext(SPRING_BEANS_CONFIGURATION_PATH);
		
		System.out.println("===== beans =====");
		var beans = context.getBeanDefinitionNames();
		Arrays.stream(beans).forEach(System.out::println);
		
		// Step 4: Consume, inject/get beans for usage
		System.out.println("\n===== objects(via constructor) =====");
		var grx = context.getBean("grx", ItemGroup.class);
		var gry = context.getBean("gry", ItemGroup.class);
		System.out.println("grx: " + grx);
		System.out.println("gry: " + gry);
		
		System.out.println("\n===== objects(via setter) =====");
		var ita = context.getBean("ita", Item.class);
		System.out.println("ita: " + ita);
		
		System.out.println("\n===== objects(via static factory method) =====");
		var clientService1 = context.getBean("clientService1", ClientService.class);
		System.out.println("buy me a --> " + clientService1.buyMeACoffee());
		
		var clientService2 = context.getBean("clientService2", ClientService.class);
		System.out.println("buy me a --> " + clientService2.buyMeACoffee());
		
		System.out.println("\n===== bean scope =====\n");
		var grz1 = context.getBean("grz", ItemGroup.class);
		
		grz1.setName("Item Group GRZ1");
		
		var grz2 = context.getBean("grz", ItemGroup.class);
		System.out.println("grz1: " + System.identityHashCode(grz1) + " --> " + grz1);
		System.out.println("grz2: " + System.identityHashCode(grz2) + " --> " + grz2);
		
		context.close();
	}
	
}
