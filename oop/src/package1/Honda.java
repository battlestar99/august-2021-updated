package package1;

public class Honda extends Car{
	int doorNumbers = 4;
	protected double engine = 1.8;
	private int CarValue = 20000;

	public void doors() {
		this.doorNumbers = 4;
		System.out.println(doorNumbers);
	}
	
	public void doors(int doorsNum) {
		this.doorNumbers = doorsNum;
		System.out.println(doorNumbers);
	}
	
	public void startCar() {
		System.out.println("Auto Start car");
	}

}

