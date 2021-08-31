package pack2;

public class facebook {
	
	// properties or global variables or class level variable
	
	String username; 
	String password; 
	
	
	public facebook() {
	
		System.out.println("an object is created");
		
	}
	
	
	
	public static void countUserNumber() {
		
		System.out.println("number of users");
	}
	
	
	public void printUsername() {
		
		String username = "test123";
		System.out.println(this.username);
		
		
	}
	
	
	public void post() {
		// local variable
		String x; 
		System.out.println("posting content");
		
	}
	
    public void like() {
		
		System.out.println(username);
		
	}
    
    public void chat() {
		
		System.out.println("starting talking");
		
	}
    
    public void call() {
		
		System.out.println("calling");
		
	}



}
