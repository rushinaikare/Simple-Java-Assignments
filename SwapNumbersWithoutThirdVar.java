//Swap two numbers without using third variable
public class SwapNumbersWithoutThirdVar {

	public void swapTwoNumbers(int a , int b) {
		 System.out.println("a = "+a+" b = "+b);
		 a = a+b;
		 b = a-b;
		 a = a-b;		 
		 System.out.println("a = "+a+" b = "+b);
	 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 SwapNumbersWithoutThirdVar obj = new SwapNumbersWithoutThirdVar();
		 obj.swapTwoNumbers(2, 5);
		
	}

}
