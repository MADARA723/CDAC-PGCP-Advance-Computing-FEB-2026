
//1. Accept 3 numbers from command line arguments. If number is prime, then print the table of
//the number. Other wise divide number by 10 and display output
package Assignment1;

public class PrimeNum1 {

    public static void main(String [] args)
    {
    	if(args.length!=3)
    	{
    		System.out.println("Enter Exactly 3 numbers");
    		return;
    	}
    	
    	for(int i=0;i<3;i++)
    	{
    		int num=Integer.parseInt(args[i]);
    		
    		if(isPrime(num))
    		{
    			printTable(num);
    			
    		}
    		else
    		{
    			System.out.println("Not Prime"+num);
    			System.out.println("Result after dividing by 10"+(num/10.0));
    		}
    		System.out.println("----------------------------");
    	}
    	
    }

	private static void printTable(int num) {
		// TODO Auto-generated method stub
		System.out.println("Table of"+num+":");
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+"x"+i+"="+(num*i));
		}
		
	}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		
		if(num<=1)
			return false;
		//
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		
		return true;
	}
}    
