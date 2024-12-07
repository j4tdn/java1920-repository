package lesson24.springcore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import lesson24.springcore.common.Catalog;
import lesson24.springcore.service.MovieCatalog;

@Configuration
public class MovieServiceConfig {
	
	/*
	 <bean id="mv1" class="..MovieCatalog">
	 	<constructor-arg name="catalog" value="ACTION"></constructor-arg>
	 </bean>
	 */
	
	@Bean
	public MovieCatalog mv1() {
		return new MovieCatalog(Catalog.ACTION);
	}
	
	@Bean
	public MovieCatalog mv2() {
		return new MovieCatalog(Catalog.ADVENTURE);
	}
	
	@Bean
	@Primary // bean mv3 sẽ là bean mặc định nếu dùng @Autowired mà ko chỉ định bean
	public MovieCatalog mv3() {
		return new MovieCatalog(Catalog.NO);
	}
	
}
