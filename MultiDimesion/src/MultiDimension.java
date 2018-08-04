
//This program does binary search on 2 dimensional array
import java.io.*;

public class MultiDimension {
	static int MAX = 100;

//this function performs binary search
	static void binarySearch(int mat[][], int i, int low, int high, int x) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (mat[i][mid] == x) {
				System.out.println("Found");
				return;
			} else if (mat[i][mid] > x) {
				high = mid - 1;
			} else
				low = mid + 1;
		}
		System.out.println("Not found");

	}

//Function to perform binary search on the mid values of rows
	static void sortedMatrix(int mat[][], int n, int m, int x) {
		if (n == 1) {
			binarySearch(mat, 0, 0, m - 1, x);
			return;
		}
		int i_low = 0;
		int i_high = n - 1;
		int mid = (i_low + i_high) / 2;
		while ((i_low + 1) < i_high) {
			int i_mid = (i_low + i_high) / 2;
			if (mat[i_mid][mid] == x) {
				System.out.println("Found ");
				return;
			} else if (mat[i_low + 1][mid] == x) {
				System.out.println("Found");
				return;
			} else if (x <= mat[i_low][mid - 1])
				binarySearch(mat, i_low, 0, mid - 1, x);
			else if (x >= mat[i_low][mid + 1] && x <= mat[i_low][m - 1])
				binarySearch(mat, i_low, mid + 1, m - 1, x);
			else if (x <= mat[i_low + 1][mid - 1])
				binarySearch(mat, i_low + 1, 0, mid - 1, x);
			else
				binarySearch(mat, i_low + 1, mid + 1, m - 1, x);
		}
	}

	public static void main(String args[]) {
		int n = 4, m = 5, x = 8;
		int mat[][] = { { 0, 6, 8, 9, 11 }, { 2, 44, 44, 55, 66 }, { 23, 55, 78, 34, 45 }, { 12, 34, 56, 13, 89 },
				{ 89, 90, 97, 86, 64 } };
		sortedMatrix(mat, n, m, x);

	}

}
