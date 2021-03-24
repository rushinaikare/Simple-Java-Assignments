import java.util.Scanner;

//Java Program to Display Floyd's Triangle

public class FloydsTriangle {
	
	
	public void floydsTriangle(int n) {
		int a =1;
		for(int  i = 0 ; i<=n ; i++) {
			for(int j = 1 ; j<=i ; j++) {
				System.out.print(" "+a);
				a++;
			}System.out.println();
			
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		 FloydsTriangle f = new FloydsTriangle();
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter Number of Rows Of Floyds Triangle");
		 int numberOfRows = scanner.nextInt(); 
		 f.floydsTriangle(numberOfRows);
		 scanner.close();
		 
		 
	}

}
