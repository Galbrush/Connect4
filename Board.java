
public class Board {


  public char[][] board;
  public int row, col;
  Display display;
  PlayerInput playerInput;
  boolean checkWin, checkFull, checkFullAll;

  public Board(int row, int col) {
    this.row = row;
    this.col = col;
    this.board = new char[row][col];
    this.playerInput = new PlayerInput(this);
    
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

  public void placeCounter(int move, char player) {
    int cl = move -1;
    boolean counterPlaced = false;
    //if the column is full - chose another
    
    if(checkFull(cl)) {
      display.displayFull();
      this.placeCounter(playerInput.getPlayerInput(), player);
      }
    
    for(int rw = board.length-1; rw >= 0; rw--) {
      
      //place a token on the upper most empty space of chosen column
      if(board[rw][cl] == ' ') {
        board[rw][cl] = player;
        counterPlaced = true;
        break;
      }

      
    }
    //if this didn't work - show an error message
    if(!counterPlaced) {
        display.displayTokenError();
    }
    //display board
    display = new Display(this);
    display.displayBoard();
  }

  public boolean checkWin() {
    checkWin = false;
    
    //check vertical
    for(int cl= 0; cl<board[0].length; cl++) {
      for(int rw= 0; rw<board.length-3; rw++) {
        if (board[rw][cl] != ' ' && board[rw][cl] == board[rw+1][cl] && board[rw+1][cl] == board[rw+2][cl] && board[rw+2][cl] == board[rw+3][cl]) {
          checkWin = true;
          return checkWin;  
        }
      }
    }
    
    //check horizontal
    for(int cl= 0; cl<board[0].length-3; cl++) {
      for(int rw= 0; rw<board.length; rw++) {
        if (board[rw][cl] != ' ' &&board[rw][cl] == board[rw][cl+1] && board[rw][cl+1] == board[rw][cl+2] && board[rw][cl+2] == board[rw][cl+3]) {
          checkWin = true;
          return checkWin;
        }
      }
    }
    
    //check neg diagonals
    for(int rw = 0; rw<board.length-3;rw++) {
      for(int cl = 0; cl<board[0].length-3;cl++) {
        if(board[rw][cl] != ' ' && board[rw][cl] == board[rw+1][cl+1] && board[rw+1][cl+1] == board[rw+2][cl+2] && board[rw+2][cl+2] == board[rw+3][cl+3]) {
          checkWin = true;
          return checkWin;
        }
      }
    }
    //check pos diagonals
    for(int rw = 3; rw<board.length; rw++) {
      for(int cl = 0; cl<board[0].length-3;  cl++) {
        if(board[rw][cl] != ' ' && board[rw][cl] == board[rw-1][cl+1] && board[rw-1][cl+1] == board[rw-2][cl+2] && board[rw-2][cl+2] == board[rw-3][cl+3]) {
          checkWin = true;
          return checkWin;
        }
      }
    }
    
    return checkWin;
  }

  public boolean checkFull(int cl) {
    checkFull = false;
    if(board[0][cl] != ' ') {
      checkFull = true;
    }
  
    return checkFull;
  }

  public boolean checkFullAll() {
    checkFullAll = true;
    for(int cl=0; cl<board[0].length; cl++) {
      if(!checkFull(cl)) {
        checkFullAll = false;
      }
    }
    return checkFullAll;
  }
}

