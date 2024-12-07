package lesson24.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.*;

@Component // tạo bean cho class
@Scope(SCOPE_SINGLETON)
public class MovieService {
	
	// IOC: bean MovieCatalog(ACTION) --> name='mv1'
	
	@Autowired // Nếu class MovieCatalog chỉ có 1 bean trong IOC thì @Autowired là đủ, ko cần chỉ rõ bean nào
	@Qualifier("mv1") // dùng bean có id là mv1
	private MovieCatalog movieCatalog;
	
	public void recommend() {
		System.out.println(">> Recommend --> " + movieCatalog.getMovie());
	}
	
}
