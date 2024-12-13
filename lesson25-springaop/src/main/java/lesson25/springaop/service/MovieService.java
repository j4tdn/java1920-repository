package lesson25.springaop.service;

// #JoinPoint class có 2 methods
public class MovieService {
	
	public void recommendFilm() {
		System.out.println("MovieService#recommend --> F-AD film");
	}
	
	public void recommendTheater() {
		System.out.println("MovieService#recommend --> T-AD theater");
	}
	
	
}
