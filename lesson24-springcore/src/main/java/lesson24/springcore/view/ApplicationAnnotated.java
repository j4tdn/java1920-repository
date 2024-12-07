package lesson24.springcore.view;

import java.util.Arrays;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lesson24.springcore.configuration.AppConfig;
import lesson24.springcore.service.MovieService;

public class ApplicationAnnotated {
	
	/*
	 
	 Với annotation khởi tạo bean qua
	 
	 + Class: thêm @Configuration(là file configuration tổng)
	 + Method: @Bean
	 
	 
	 */
	
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("===== beans =====");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		
		System.out.println("\n\\n===== beans demo =====");
		MovieService movieService = context.getBean("movieService", MovieService.class);
		movieService.recommend();
		
		System.out.println("\n\\n===== beans scope demo =====");
		
		MovieService movieService1 = context.getBean("movieService", MovieService.class);
		MovieService movieService2 = context.getBean("movieService", MovieService.class);
		
		System.out.println("movieService1: " + System.identityHashCode(movieService1));
		System.out.println("movieService2: " + System.identityHashCode(movieService2));
		
		context.close();
		
	}
	
}
