package lesson24.springcore.view;

import java.util.Arrays;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lesson24.springcore.configuration.AppConfig;
import lesson24.springcore.controller.ItemController;

public class WebApp {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("===== beans =====");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		// Nếu class chỉ có 1 bean duy nhất context.getBean(ItemController.class)
		ItemController controller = context.getBean(ItemController.class);
		controller.viewHomePage();
		
		context.close();

	}

}
