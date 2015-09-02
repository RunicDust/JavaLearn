package intro;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			makeSpiralMatrix(scan.nextInt());		
		}
		scan.close();
	}

///////////////////////////////////////////////////////////////////////////////////////
	public static int[][] makeSpiralMatrix(int n) {
		
		//Check positive condition
		if (n<=0) {
			System.out.println("Must be positive!");
			return null;
		}
		// Template for square matrix
		int[][] matr = new int[n][n];
		// Initial boundaries
		int top = 0, but = n - 1, left = 0, right = n - 1;
		// Counter to fill the matrix
		int count = 1;

		
		// Four for-loops for every side of matrix
		while (count < n * n + 1) {

			for (int j = left; j <= right; j++) {
				matr[top][j] = count;
				count++;

			}
			top++;
			for (int i = top; i <= but; i++) {
				matr[i][right] = count;
				count++;
			}
			right--;
			for (int j = right; j >= left; j--) {
				matr[but][j] = count;
				count++;
			}
			but--;

			for (int i = but; i >= top; i--) {
				matr[i][left] = count;
				count++;
			}
			left++;

		}
		
// Printing spiral matrix		
		for (int i = 0; i < matr.length; i++) {
			System.out.println(Arrays.toString(matr[i]));
		}

		return matr;
	}
}
