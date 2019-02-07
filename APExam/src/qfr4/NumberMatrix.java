package qfr4;

import java.util.Arrays;

public class NumberMatrix {
	private static int[][] matrix;

	public NumberMatrix(int[][] matrix) {
		super();
		this.matrix = matrix;
	}

	public static void shiftMatrix(int num) {
		for (int[] row : matrix) {

			int temp = row[row.length - 1];
			System.out.println("Last element in origial row is in temp now: " + temp);
			ArrayUtil.ShiftArray(row, num);
			num = temp;
		}

		System.out.println(Arrays.deepToString(matrix));
	}

	public static void rotateMatrix() {
		int mL = matrix.length;
		int m0L = matrix[0].length;
		System.out.println("Matrix Length: " + mL + " Matrix[0] Length: " + m0L);

		shiftMatrix(matrix[mL - 1][m0L - 1]);
	}

	public static void main(String[] args) {
		int[][] m = new int[][] { { 13, 14, 15 }, { 16, 17, 18 }, { 19, 20, 21 }, { 22, 23, 24 }, };
		matrix = m;
		//shiftMatrix(48);

		rotateMatrix();
	}

}
