package basicprogrammes;

public class PalidromeNumber {

	public static void main(String[] args) {
		int num=245,rev=0,rem=0;
	    int temp=num;
	    
		for(;num>0;)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		System.out.println("Reverse number :"+temp);
		if(temp==0);
		{
		System.out.println("Given Number is Palindrome :"+temp);
		

		}
	}
}


			
				
		
	
