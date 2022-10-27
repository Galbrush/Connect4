public class Connect4 {
  PlayerInput playerInput;
  Display display;
  Board board;
  
  

  public Connect4() {
    this.board = new Board(6, 7);
    this.display = new Display(board);
    this.playerInput = new PlayerInput(board);
    playConnect4();
  }

  public void playConnect4() {
    //intro message
    display.displayInstructions();
    //display beginning board
    display.displayBoard();
    //get player one to place their first counter and display board
    do{
      board.placeCounter(playerInput.getPlayerInput(), 'r');
      board.placeCounter(playerInput.getPlayerInput(), 'y');
    } while(!board.checkWin());
    //place counter for computer
    //repeat until one letter appears 4 times next to each other
    //display winning message
  

    
  }

}