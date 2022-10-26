public class Connect4 {
  PlayerInput playerInput;
  Display display;
  
  

  public Connect4() {
    Board board = new Board(6, 7);
    Display display = new Display(board);
    
    
    board.placeCounter(2);
    board.placeCounter(2);
    
    
    
  }
}