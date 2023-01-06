package methods;


public class Method1 {

	static void addTwoNum(int a,int b) {//int a=10, int b=20
		int res=a+b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("res: "+res);
		//return;//java complier will write behalf of program
	}
	public static void main(String[] args) {	
		
		addTwoNum(10, 20);
		addTwoNum(100, 200);
		Method1.addTwoNum(101, 202);
		Method1.addTwoNum(110, 208);
		Method1.addTwoNum(210, 205);
	}
}
