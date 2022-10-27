public class Connect4 {
  PlayerInput playerInput;
  Display display;
  Board board;
  char[] playersArr = {'r', 'y'};
  char currentMovePlayer = 0;
  Player player;
  
  

  public Connect4() {
    this.board = new Board(6, 7);
    this.display = new Display(board);
    this.playerInput = new PlayerInput(board);
    this.player = new Player(playersArr[currentMovePlayer]);
    playConnect4();
  }

  public void playConnect4() {
    
    //intro message
    display.displayInstructions();
    //display beginning board
    display.displayBoard();
    //get player one to place their first counter and display board
    do{
      if(currentMovePlayer % playersArr.length == 0) {
        board.placeCounter(playerInput.getPlayerInput(), 'r');
      }
      else {
        board.placeCounter(playerInput.getPlayerInput(), 'y');
      }
      currentMovePlayer++;
    } while(!board.checkWin() || board.checkFullAll());

    if(board.checkWin()) {
      System.out.println("Someone wins");
    }
    if(board.checkFullAll()) {
      System.out.println("It's a draw!");
    }
    //place counter for computer
    //repeat until one letter appears 4 times next to each other
    
    //display winning message
  

    
  }

}