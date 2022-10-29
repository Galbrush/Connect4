public class Display {

  
  char[][] board;
  Board b;
    
  public Display(Board b) {
    this.b = b;
    this.board = b.board;
  }
  //beginning messages
  public void displayInstructions(){
    System.out.println("--------Welcome to Connect 4--------");
	  System.out.println("There are 2 players: red and yellow");
	  System.out.println("Player 1 is Red, Player 2 is Yellow");
    System.out.println("------------------------------------");
	  System.out.println("To play the game type in the number of the column you want to drop your counter in.");
	  System.out.println("A player wins by connecting 4 counters in a row - vertically, horizontally or diagonally.");
	  System.out.println("");
 }

  //display winning message
  public void displayWin() {
    System.out.println("You have won!");
  }

  public void displayBotWin() {
    System.out.println("The computer has won! You have lost!");
  }

  //display current board
  public void displayBoard() {
    
    for(int rw=0; rw<board.length; rw++){
			for(int cl=0; cl<board[rw].length; cl++){
				if(board[rw][cl] == 'r'){
					System.out.print("| r ");
				}
				else if(board[rw][cl] == 'y'){
					System.out.print("| y ");
				}
				else{
					System.out.print("|   ");
				}
			}
			System.out.println("|");
		}
		System.out.println("  1   2   3   4   5   6   7");
	}

  public void displayWinner(char player) {
    System.out.println("The winner is " + player);
  }

  public void displayDraw() {
    System.out.println("It's a draw!");
  }
  //
}