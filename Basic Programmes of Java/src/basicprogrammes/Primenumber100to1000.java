package basicprogrammes;

public class Primenumber100to1000 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
          for(int i=100;i<=1000;i++)
          {
        	  int a=i,total=0,rem;
        	int temp=a;
        	while(a>0);
        	{
        		rem=a%10;
        		
        		total=total+rem*rem*rem;
        		a=a/10;
        	}
        	if(total==temp)  
        	{
        		System.out.println(temp+"is armstrong number");
        	}
          }
	}

}
