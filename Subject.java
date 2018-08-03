
//program to find the marks avg and sum of subjects and also find the avg and sum of each subjects

import java.util.Scanner;

public class Subject {
	public static void main(String[] args) {
		int i, sum, avg;
		Scanner sc = new Scanner(System.in);
		int a[] = new int[4];
		int b[] = new int[4];
		int c[] = new int[4];
		System.out.println("Enter the marks of 1st student");
		for (i = 1; i <= 3; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the marks of 2nd student");
		for (i = 1; i <= 3; i++) {
			b[i] = sc.nextInt();
		}
		System.out.println("Enter the marks of 3rd student");
		for (i = 1; i <= 3; i++) {
			c[i] = sc.nextInt();
		}
		int sum1 = 0, avg1 = 0;
		for (i = 1; i <= 3; i++)
			sum1 = sum1 + a[i];
		avg = sum1 / 3;
		System.out.println(sum1 + "sum" + avg + "avg");
		int sum2 = 0, avg2 = 0;
		for (i = 1; i <= 3; i++)
			sum2 = sum2 + b[i];
		avg = sum2 / 3;
		System.out.println(sum2 + "sum" + avg + "avg");
		int sum3 = 0, avg3 = 0;
		for (i = 1; i <= 3; i++)
			sum3 = sum3 + c[i];
		avg = sum3 / 3;
		System.out.println(sum3 + "sum" + avg + "avg");
		System.out.println("sum n avg in each sub");
		for (i = 1; i <= 3; i++) {
			int fsum = a[i] + b[i] + c[i];
			System.out.println("sumin" + i + "sum is" + fsum);
		}

	}
}
