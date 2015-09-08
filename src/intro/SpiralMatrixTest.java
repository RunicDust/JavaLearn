package intro;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpiralMatrixTest {

	@Test
	public void TestForNegative() {
		assertArrayEquals(null, SpiralMatrix.makeSpiralMatrix(-1));
	}

	@Test
	public void TestFor2() {
		int[][] matrix2 = { { 1, 2 }, { 4, 3 } };
		assertArrayEquals(matrix2, SpiralMatrix.makeSpiralMatrix(2));
	}

	@Test
	public void TestFor3() {
		int[][] matrix3 = { { 1, 2, 3 }, { 8, 9, 4 }, { 7, 6, 5 } };
		assertArrayEquals(matrix3, SpiralMatrix.makeSpiralMatrix(3));
	}

	@Test
	public void TestFor5() {
		int[][] matrix5 = { { 1, 2, 3, 4, 5 }, { 16, 17, 18, 19, 6 }, { 15, 24, 25, 20, 7 }, { 14, 23, 22, 21, 8 },
				{ 13, 12, 11, 10, 9 } };
		assertArrayEquals(matrix5, SpiralMatrix.makeSpiralMatrix(5));

	}

}
