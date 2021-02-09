public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 Factorial(5);
		
	}
	
  	public static void Factorial(int num) {
		int fact = 1  ;
		for(int i = 1 ; i  <= num ; i++ ) {
				 fact = fact*i;
      	}
	  System.out.println("Factorial is "+fact);
	}	

}