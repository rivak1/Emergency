package get2019.assignment7;

public final class SparseMatrices {

	private final int Matrix[][];

	public int[][] getMatrix() {
		return Matrix;
	}

	public SparseMatrices(int[][] matrix) {
		super();
		Matrix = matrix;
	}

	
	private int[][] geneateSparseMatrix(int Matrix[][]){		
		int size=0;
		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[0].length; j++) {
				if(Matrix[i][j] != 0) {
					size++;
				}
			}
		}
		int sparseMatix[][] = new int[3][size]; 
		int k=0;
		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[0].length; j++) {
				if(Matrix[i][j] != 0) {
					sparseMatix[0][k] = i;
					sparseMatix[1][k] = j;
					sparseMatix[2][k] = Matrix[i][j];
					k = k + 1;
				}
			}
		}
		return sparseMatix;
	}

	public int[][] getTranspose(int[][] matrix2) {
		int sparseMatrix[][] = this.geneateSparseMatrix(matrix2);
		int transMatrix[][]= findTranspose(sparseMatrix);
		//int main[][]=this.genrateMainMatrix(transMatrix);
		return transMatrix;
	}

	private int[][] findTranspose(int[][] sparseMatrix) {
		int k=0;
		int transMatrix[][]  = new int[sparseMatrix.length][sparseMatrix[0].length];
		for (int j = 0; j < sparseMatrix[0].length; j++) {
			transMatrix[0][k] = sparseMatrix[1][j];
			transMatrix[1][k] = sparseMatrix[0][j];
			transMatrix[2][k] = sparseMatrix[2][j];
			k = k + 1;
		}
		return transMatrix;
	}

	private int[][] genrateMainMatrix(int[][] transMatrix) {
		int newMain[][] = new int[this.getMatrix()[0].length][this.getMatrix().length];

		for (int i = 0; i < transMatrix[0].length; i++) {
			int row1 = transMatrix[0][i];
			int col1 = transMatrix [1][i];
			int value = transMatrix [2][i];
			newMain[row1][col1] = value;
		}
		return newMain;
	}

	public boolean findSymetric(int[][] matrix2) {
		int sparseMatrix1[][] = this.geneateSparseMatrix(matrix2);
		int transMatrix[][]= findTranspose(sparseMatrix1);
		int mainMatrix[][] = this.genrateMainMatrix(transMatrix);
		int sparseMatrix2[][] = this.geneateSparseMatrix(mainMatrix);
		for (int i = 0; i <sparseMatrix1[0].length; i++) {
			if(sparseMatrix1[0][i] != sparseMatrix2[0][i]) {
				return false;
			}
			if(sparseMatrix1[1][i] != sparseMatrix2[1][i]) {
				return false;
			}
			if(sparseMatrix1[2][i] != sparseMatrix2[2][i]) {
				return false;
			}
		}
		return true;
	}

	public int[][] getMulti(int[][] matrix1,int[][] matrix2) {
		
		if(matrix1[0].length != matrix2.length) {
			throw new AssertionError();
		}
		
		int mulMatrix[][] = new int[matrix1.length][matrix2[0].length];
		
		int sparse1[][]  = this.geneateSparseMatrix(this.getMatrix()); 
		
		int sparse2[][]  = this.geneateSparseMatrix(matrix2);

		int sparse2T[][] = this.getTranspose(matrix2);
		
		for (int i = 0; i < sparse1[0].length; i++) {
			
			int row1 = sparse1[1][i]; //column
			int sum=0;
			int col1 = sparse1[0][i];
			for (int j = 0; j < sparse2T[0].length; j++) {
				
				int row2 = sparse2T[0][j];
				int col2 = sparse2T[1][j];

				int temp1=i;
				int temp2=j;
				while(temp1<sparse1[0].length&&temp2<sparse2T[0].length&&row2 == row1 && col1 == col2) {
					System.out.println("dd");
					sum =sum+sparse1[2][i]*sparse2T[2][j];
					temp1++;
					temp2++;
				}
				mulMatrix[col1][col2] = sum;
			}
		}
		return mulMatrix;
		
		
	}	
	
}
