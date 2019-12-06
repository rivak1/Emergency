package get2019.assignment7;

public class Main {

	public static void main(String[] args) {
//		int matrix[][] = new int[][] {{0,0,3,0,4},{0,0,5,7,0},{0,0,0,0,0},{0,2,6,0,0}};
//		SparseMatrices obj = new SparseMatrices(matrix);
//		int newMatrix[][]=obj.getTranspose(obj.getMatrix());
//		
//		for (int i = 0; i < newMatrix.length; i++) {
//			for (int j = 0; j < newMatrix[0].length; j++) {
//				System.out.print(newMatrix[i][j]);
//			}
//			System.out.println();
//		}
		int matrix1[][] = new int[][] {{2,0,1},{0,1,0},{1,0,2}};
		SparseMatrices obj = new SparseMatrices(matrix1);
		int matrix2[][] = new int[][] {{2,0,1},{0,1,0},{1,0,2}};
		int newMatrix1[][]=obj.getMulti(matrix1,matrix2);
		System.out.println(newMatrix1.length+"ss");
		for (int i = 0; i < newMatrix1.length; i++) {
			for (int j = 0; j < newMatrix1[0].length; j++) {
				System.out.print(newMatrix1[i][j]);
			}
			System.out.println();
		}
	}
}
