
public class NumberOfDigits {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
			System.out.println("program to check how many digits does a number contain");
			System.out.println("enter the number");
			
			int number=789;
			int count=0;
			int digits=0;
			
			if (number!=0) {
			number/=10;
			++count;
			count = digits;
			System.out.println("number of digits are" + digits);
			}
			
	}

}
