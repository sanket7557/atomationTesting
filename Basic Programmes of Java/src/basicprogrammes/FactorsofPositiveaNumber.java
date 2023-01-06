package basicprogrammes;

public class FactorsofPositiveaNumber {

	public static void main(String[] args) {
		
           int num1=55;
           for(int i=0; i<= num1; ++i) {
           
        	   if(i==0) {
        		   continue;
        	   }
        	    else {
        		   if (num1 % i==0) {
        			   System.out.print(i + ",");
        		   }
        	   }
           }
	}

}
