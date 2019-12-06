package gate2019.assignment;

public class Main {

	public static void main(String[] args) {
		
		int chessBoard[][] = new int[4][4];
		for( int i = 0; i < chessBoard.length; i++) {
			
			for(int j=0;j<chessBoard.length;j++) {
				
				chessBoard[i][j]=0;
				
			}
		}
		
		for( int i = 0; i < chessBoard.length; i++){
			
			for(int j=0;j<chessBoard.length;j++) {
				
				System.out.print(chessBoard[i][j]);
				
			}
		}
		
		NqueenProblem NqueenProblemObj =  new NqueenProblem();
		NqueenProblemObj.InsertQueen(chessBoard);
		
	}

}
