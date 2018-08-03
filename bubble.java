
//sorting using bubble sort
import java.util.Scanner;

public class bubble {
	public static void main(String[] args) {
		int i, j, key;
		int arr[] = new int[15];
		int n = arr.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array");
		for (i = 0; i < 15; i++) {
			arr[i] = sc.nextInt();
		}

		// comparision for sorting
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n - i - j; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = arr[j];
				}
			}
		}
		System.out.println("The sorted arrayn is");
		for (i = 0; i < 15; i++) {

			System.out.print(arr[i] + " ");
		}
	}
}
