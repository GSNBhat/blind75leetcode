public class Sudoku {

	public static final int GRID_SIZE = 9;


    public static boolean isValidNumberForRow(int[][] board, int row, int number){

		for (int i =0; i < GRID_SIZE ; i++) {
			if(board[row][i] == number){
				return false;
			}
		}
		return true;
	}


    public static boolean isValidNumberForCol(int[][] board, int col, int number){

		for (int i =0; i < GRID_SIZE ; i++) {
			if(board[i][col] == number){
				return false;
			}
		}
		return true;
	}


	public static boolean isValidNumberForLocalBox(int[][] board, int col, int row, int number){

		int localRow = row - row % 3; 
		int localCol = col - col % 3; 

		for (int i = localRow ; i < localRow + 3; i++) {
			for (int j = localCol ; j < localCol + 3; j++) {
				if(board[i][j] == number){
					return false;
			 }
			}
		}
		return true;
	}

	public static boolean isValidNumber(int[][] board, int col, int row, int number) {
		
		return isValidNumberForCol(board, col, number)  
		&& isValidNumberForRow(board, row, number) 
		&& isValidNumberForLocalBox(board, col, row, number);
	}

	public static boolean solveBoard(int[][] board){

		for (int i = 0 ; i < GRID_SIZE; i++) {
			for (int j = 0 ; j < GRID_SIZE; j++) {

				if(board[i][j] == 0){
					
					for(int tryNumber = 1; tryNumber <= 9; tryNumber++){
						
						if(isValidNumber(board,j,i, tryNumber)){


							board[i][j] = tryNumber;

							if(solveBoard(board)){
								return true;
							}
							else{
								board[i][j] = 0;
							}
						}
					}

					return false;
			 	}
			}
		}

		return true;

	}

	public static void printBoard(int[][] board) {
		for(int i=0; i < GRID_SIZE; i++){
		
			
			if( i%3 == 0){
				System.out.println("---------------------");
			}
			for(int j=0; j < GRID_SIZE; j++){
				if( j%3 == 0){
					System.out.print("|");
				}
				System.out.print(board[i][j]+" ");
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println("---------------------");
	}

    public static void main(String[] args) {
        
        // int board[][] ={{7, 0, 2, 1, 5, 4, 3, 8, 6}, 
		// {6, 4, 3, 8, 2, 7, 1, 5, 9},
		// {8, 5, 1, 3, 9, 6, 7, 2, 4},
		// {2, 6, 5, 9, 7, 3, 8, 4, 1},
		// {4, 8, 9, 5, 6, 1, 2, 7, 3},
		// {3, 1, 7, 4, 8, 2, 9, 6, 5},
		// {1, 3, 6, 7, 0, 8, 5, 9, 2},
		// {9, 7, 4, 2, 1, 5, 6, 3, 8},
		// {5, 2, 8, 0, 3, 9, 4, 1, 0}};

		int board[][] = {{3, 8, 5, 0, 0, 0, 0, 0, 0, },
		{9, 2, 1, 0, 0, 0, 0, 0, 0, },
		{6, 4, 7, 0, 0, 0, 0, 0, 0, },
		{0, 0, 0, 1, 2, 3, 0, 0, 0, },
		{0, 0, 0, 7, 8, 4, 0, 0, 0, },
		{0, 0, 0, 6, 9, 5, 0, 0, 0, },
		{0, 0, 0, 0, 0, 0, 8, 7, 3, },
		{0, 0, 0, 0, 0, 0, 9, 6, 2, },
		{0, 0, 0, 0, 0, 0, 1, 4, 5, }};

		System.out.println(solveBoard(board));

		printBoard(board);

		
    }
}