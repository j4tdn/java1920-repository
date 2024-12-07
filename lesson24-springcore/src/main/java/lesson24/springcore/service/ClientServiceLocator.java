package lesson24.springcore.service;

// Goal: initial bean via non-static method
public class ClientServiceLocator {
	
	private static ClientService clientService = ClientService.getInstance();
	
	public ClientService createService() {
		System.out.println(">> initial bean via non-static method");
		return clientService;
	}
}
