package basicprogrammes;

public class Addition {

	public static void main(String[] args) {
	
          int a, b, temp;
          a=25;
          b=35;
          System.out.println("Before swap :a, b="+a+"," + +b);
          
          temp=a;
          a=b;
          b=temp;
          System.out.println("after swap :a, b="+a+","+ +b);
	}
}