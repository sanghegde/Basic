
// program to provide the 3 subject and declare the result based on the conditions
import java.util.Scanner;

public class Mark {
	public static void main(String[] args) {
		int m1, m2, m3;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter m1: ");
		m1 = sc.nextInt();
		System.out.println("enter m2: ");
		m2 = sc.nextInt();
		System.out.println("enter m3: ");
		m3 = sc.nextInt();
		if (m1 >= 60 && m2 >= 60 && m3 >= 60) {
			System.out.println("students passsed");
		} else if (m1 >= 60 && m2 >= 60 || m2 >= 60 && m3 >= 60 || m3 >= 60 && m1 >= 60) {
			System.out.println("students promted");
		} else if (m1 >= 60 || m2 >= 60 || m3 >= 60 || (m1 < 60 && m2 < 60 && m3 < 60)) {
			System.out.println("students failed");
		}
	}
}