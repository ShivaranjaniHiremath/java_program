class BitwiseOperators {

   public static void main(String args[]) {
   
	  System.out.println("illustrating bitwise operators");
	  
   
      int a = 50;
      int b = 13;	
      

      int c = a & b;        
      System.out.println("a & b = " + c );

      int d = a | b;        
      System.out.println("a | b = " + d );

      int e = a ^ b;        
      System.out.println("a ^ b = " + e );

      int f = ~a;           
      System.out.println("~a = " + f );

      
	  
	  System.out.println("illustrating birwise shift operators");
	  int x = 4; 
	  System.out.println("signed right shift operator:" + (x>>1)); 
	  int z = 4; 
	  System.out.println("signed left shift operator:" + (z<<1)); 
	  
	  //unsigned right shift operator
	  
	  int y = 3; 

	  System.out.println(y>>>6);  
	  System.out.println(y>>>7);
	  System.out.println(y>>>8);
   }
}
