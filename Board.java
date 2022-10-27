//Board setup. With a constructor that set's up the board with a n by n board. 


public class Board {


  public char[][] board;
  public int row, col;
  Display display;
  PlayerInput playerInput;
  boolean checkWin;

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

  public void placeCounter(int move) {
    int cl = move -1;
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

  public boolean checkWin() {
    checkWin = false;
    //check verticals
    for(int cl= 0; cl<board.length; cl++) {
      for(int rw= 0; rw<board.length-3; rw++) {
        if (board[rw][cl] == 'r' &&board[rw][cl] == board[rw+1][cl] && board[rw+1][cl] == board[rw+2][cl] && board[rw+2][cl] == board[rw+3][cl]) {
          System.out.println("Someone has won");
          checkWin = true;
          
        }
      }
    }
    
    //check verticals
    for(int cl= 0; cl<board.length-3; cl++) {
      for(int rw= 0; rw<board.length; rw++) {
        if (board[rw][cl] == 'r' &&board[rw][cl] == board[rw][cl+1] && board[rw][cl+1] == board[rw][cl+2] && board[rw][cl+2] == board[rw][cl+3]) {
          System.out.println("Someone has won");
          checkWin = true;
          
        }
      }
    }
    //check pos diagonals

    //check neg diagonals
    
    return checkWin;
  }
}