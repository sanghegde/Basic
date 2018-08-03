
//PROGRAM TO FIND THE KEY ELEMEMT INTHE GIVEN ARRAY
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
		int key, i;
		int arr[] = new int[15];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array");

		for (i = 0; i < 15; i++) {
			arr[i] = sc.nextInt();
		}

		// ENTER THE KEY TO BE SEARCHED
		System.out.println("Enter the key");
		key = sc.nextInt();
		for (i = 0; i < 15; i++) {

			// IF KEY FOUND
			if (key == arr[i]) {
				System.out.println("The key is " + key);
				return;
			}

		}
		// IF KEY NOT FOUND
		System.out.println("Key not found");

	}
}