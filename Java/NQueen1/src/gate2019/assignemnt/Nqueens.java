package gate2019.assignemnt;

public class Nqueens {

	private int c=1;
	boolean safeSearch(int intputArray[][] , int i , int j) {
		
		for(int col = j; col >=0; col--) {
			if(intputArray[i][col] == 1) {
				return false;
			}
		}
		
		for(int col = i; col >=0; col--) {
			if(intputArray[col][j] == 1) {
				return false;
			}
		}
		
		int k=j-1;
		int l=j+1;
		for(int row = i; row >=0; row--){
			k=k+1;
			if(k<intputArray.length) {
				//System.out.println(k+"K");
				//System.out.println(row+"row");
				//System.out.println(intputArray[row][k]+"intputArray[row][k]");
				if(intputArray[row][k] == 1 ) {
					return false;
				}
			}
			//System.out.println(l+"l");
			l=l-1;
			if(l >=0) {
					//System.out.println(intputArray[row][l]+"intputArray[row][l]");
					if(intputArray[row][l] == 1 ) {
					return false;
					}
			}
		}
		k=j-1;
		l=j+1;
		for(int row = i; row <intputArray.length; row++){
			k=k+1;
			if(k<intputArray.length) {
				//System.out.println(k+"K");
				//System.out.println(row+"row");
				//System.out.println(intputArray[row][k]+"intputArray[row][k]");
				if(intputArray[row][k] == 1 ) {
					return false;
				}
			}
			//System.out.println(l+"l");
			l=l-1;
			if(l >=0) {
					//System.out.println(intputArray[row][l]+"intputArray[row][l]");
					if(intputArray[row][l] == 1 ) {
					return false;
					}
			}
		}
		return true;
		
	}
	
	boolean insertQ(int intputArray[][],int col) {
		if(col == intputArray.length) {
			return true;
		}
		for(int i = 0; i<intputArray.length; i++){
				//System.out.println(safeSearch(intputArray,i,j));
				if(safeSearch(intputArray ,i ,col)){
					intputArray[i][col] = 1;
					
					for(int i1 = 0; i1< intputArray.length; i1++) {
						for(int j = 0; j < intputArray.length; j++) {
							System.out.print(" | ");
							System.out.print(intputArray[i1][j]+" ");
						}
						System.out.print(" | ");
						System.out.println("");
						System.out.println("");
					}
					System.out.println("Step ->"+c++);
					System.out.println("---------------------------------------------");
						
					if(!insertQ(intputArray , col+1)) {
						intputArray[i][col]=0;
					}else {
						return true;
					}
			}
		}
		return false;
	}
	
	void printElement(int inputArray[][]) {
		if(!insertQ(inputArray,0)) {
			System.out.println("not exit");
		};
		for(int i = 0; i < inputArray.length; i++) {
			for(int j = 0; j < inputArray.length; j++) {
				System.out.print(" | ");
				System.out.print(inputArray[i][j]+" ");
			}
			System.out.print(" | ");
			System.out.println();
		}
	}
	
	
}
