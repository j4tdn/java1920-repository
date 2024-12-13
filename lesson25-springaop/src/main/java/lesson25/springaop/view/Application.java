package lesson25.springaop.view;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lesson25.springaop.service.MovieService;

public class Application {
	
	private static String CONFIG_PATH = "springaop-advvice.xml";
	
	public static void main(String[] args) {
		
		System.out.println("==== No AOP ====");
		MovieService ms1 = new MovieService();
		ms1.recommendFilm();
		
		
		System.out.println("\n\n==== Use AOP ====");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_PATH);
		
		MovieService ms2 = context.getBean("mvproxy", MovieService.class);
		ms2.recommendFilm();
		ms2.recommendTheater();
		
		context.close();
		
		
	}
	
}
