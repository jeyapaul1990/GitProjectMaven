
public class BasicCalc {

	static void add(int a,int b) {
		System.out.println(a+b);
	}
	static void sub(int a,int b) {
		System.out.println(a-b);
	}
	static void mul(int a,int b) {
		System.out.println(a*b);
	}
	static void div(int a, int b) {
		System.out.println(a/b);
	}
	static void mod(int a,int b) {
		System.out.println(a%b);
	}
	
	
	public static void main(String[] args) {
		
		add(10,30);
		sub(50,20);
		mul(7,5);
		
		try {
			div(50,5);
			mod(10,2);
		}
		catch(ArithmeticException e) {
		System.out.println(e.getMessage());
		}
		

	}

}
