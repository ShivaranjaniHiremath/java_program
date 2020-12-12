class NumBelowHundred{
		public static void main(String args[]){
			System.out.println("checking whether the given number is below hundred");
			 int num;
			 System.out.println("Enter a number:");
			 scanner sc = new scanner(System.in);
			 num = sc.nextInt();
			 
			 if(num<100);{
			 System.out.println("the given number is below hundred");
			 System.out.println("the given number is:" + num);
			 }
		}	
}