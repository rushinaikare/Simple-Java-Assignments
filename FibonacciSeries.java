import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSeries {

	public void fibonaciiSeries(int n) {
		ArrayList<Integer> fibonaciiList = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {

			if (i < 2) {
				fibonaciiList.add(i);
			} else {
				for (int j = i; j <= i; j++) {

					int num = fibonaciiList.get(j - 1) + fibonaciiList.get(j - 2);
					fibonaciiList.add(i, num);
				}

			}
		}
		System.out.println(fibonaciiList);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FibonacciSeries obj = new FibonacciSeries();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of Fibonacci Series");
		int n = scanner.nextInt();
		obj.fibonaciiSeries(n);
		scanner.close();

	}

}
