package pack2;

public class facebook {
	
	// properties or global variables or class level variable
	
	String username; 
	String password; 
	
	// constructor 
	// to construct an object constructor is created
	// multiple constructor with different parameter
	// constructor overloading
	
	public facebook(String username, String password) {
		
		this.username=username; 
		this.password=password; 
		
	}
	
	public facebook(int x) {
		
		System.out.println(x);	
	}
	
	
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
    
    // having multiple methods with same name
    // and different parameter is called method overloading
    
    
    public void call() {
		
		System.out.println("this is first calling");
		
	}
    
    public int call(String x) {
    	
    	System.out.println("this is second calling");
    	return 12; 
    
    }



}
