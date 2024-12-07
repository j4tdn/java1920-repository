package lesson24.springcore.service;

// Goal: initial bean via static method
public class ClientService {
	
	private static ClientService INSTANCE = null;
	
	private ClientService() {
	}
	
	public static ClientService getInstance() {
		System.out.println(">> initial bean via static method ...");
		if (INSTANCE == null) {
			INSTANCE = new ClientService();
		}
		return INSTANCE;
	}
	
	public String buyMeACoffee() {
		return "egg-cream coffee";
	}
	
}
