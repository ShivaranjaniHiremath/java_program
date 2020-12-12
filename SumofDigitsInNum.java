
public class SumofDigitsInNum {
	    public static void main(String args[])
	    {
	        int digits, n=452, sum = 0;
	    
	        while(n>0)
	        {
	            digits = n % 10;
	            sum = sum + digits;
	            n/=10;
	        }
	       
	        System.out.println("Sum of Digits:"+sum);
	    }
	
}
