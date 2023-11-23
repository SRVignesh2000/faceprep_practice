package mockTest;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixTraversal {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 33 }, { 4, 5, 6, 66 }, { 7, 8, 9, 99 }, { 17, 18, 19, 20 } };

		List<Integer> result = new ArrayList<>();
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return;
		}

		int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;

		while (top <= bottom && left <= right) {

			for (int i = left; i <= right; i++) {
				result.add(matrix[top][i]);
			}
			top++;

			for (int i = top; i <= bottom; i++) {
				result.add(matrix[i][right]);
			}
			right--;

			if (top <= bottom) {

				for (int i = right; i >= left; i--) {
					result.add(matrix[bottom][i]);
				}
				bottom--;
			}

			if (left <= right) {

				for (int i = bottom; i >= top; i--) {
					result.add(matrix[i][left]);
				}
				left++;
			}
		}

		for (int num : result) {
			System.out.print(num + " ");
		}
	}

}
