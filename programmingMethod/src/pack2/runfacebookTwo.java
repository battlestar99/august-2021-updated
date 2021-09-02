package pack2;

public class runfacebookTwo {

	public static void main(String[] args) {
		
		
		facebook a=new facebook("abc","dafdas");
		
		facebook b = new facebook("bac","test123");
		
		b.call();
		int x = b.call("dfa");
		
		
		//facebook c = new facebook(12);
		
		System.out.println(a.username);
		System.out.println(a.password);
		
		System.out.println(b.username);
		
		
		

	}

}
