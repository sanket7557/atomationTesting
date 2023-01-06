package basicprogrammes;

public class FactorsofNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               int num=-65;
               for(int i=0; i<= Math.abs(num); i++) {
            	   
            	   if(i==0) {
            		   continue;
            	   }  else {
            		   if(num % i == 0) {
            			   System.out.print(i + ",");
            		   }
            	   
            	   }
               
	}

}

}