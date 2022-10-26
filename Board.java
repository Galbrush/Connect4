//Board setup. With a constructor that set's up the board with a n by n board. 


public class Board {


  public char[][] board;
  public int row, col;
  Display display;

  public Board(int row, int col) {
    this.row = row;
    this.col = col;
    this.board = new char[row][col];
    System.out.println("You created a new Board");
    //populate board with empty chars. 
    for(int rw = 0; rw<board.length; rw++){
      for(int cl= 0; cl<board[rw].length; cl++) {
        board[rw][cl] = ' ';
      }
    }
  }
  
  public char[][] getBoard() {
    return board;
  }

  public void placeCounter(int column) {
    
    int cl = column -1;
    boolean counterPlaced = false;

    for(int rw = board.length-1; rw >= 0; rw--) {
      if(board[rw][cl] == ' ') {
        board[rw][cl] = 'r';
        break;
      }
      else{
        System.out.println("Something didn't work.");
      }
    }
  
    //display board
    display = new Display(this);
    display.displayBoard();
  }
}