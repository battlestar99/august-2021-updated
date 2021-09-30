package package1;

public class main {

	public static void main(String[] args) {
		Honda civic = new Honda();
		civic.startCar();
		civic.doors(3);
		
		Toyota corolla = new Toyota();
		corolla.startCar();
		
		BMW x1 = new BMW();
		x1.stopCar();
	}
	
//	overriding -- runtime polymorphism
//	
//	overloading -- compiletime polymorphism
	

}
