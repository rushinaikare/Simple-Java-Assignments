import java.time.*;
import java.util.Scanner;

public class DayOfWeek {

	public static String findDay(int month, int day, int year) {

		LocalDate date = LocalDate.of(year, month, day);
		return date.getDayOfWeek().name();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date of month");
		int day = scanner.nextInt();
		System.out.println("Enter month ");
		int month = scanner.nextInt();
		System.out.println("Enter year");
		int year = scanner.nextInt();
		System.out.println(findDay(month, day, year));
        scanner.close();
	}

}
