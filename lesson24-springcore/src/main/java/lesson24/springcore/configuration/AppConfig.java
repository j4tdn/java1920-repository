package lesson24.springcore.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


// Tương tự file xml, AppConfig là nơi để chứa tất cả các cấu hình tạo bean
// == spring-bean-definition.xml

@Configuration // chỉ tạo những bean trong class này thôi
@ComponentScan(basePackages = "lesson24.springcore") // tạo bean, inject bean trong package 'basePackages'
@Import(MovieServiceConfig.class)
public class AppConfig {
	
}
