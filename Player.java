public class Player{
  char player;
  int playerID, playerNumberOf = 1;
  

  public Player(char player) {
    this.player = player;
    this.playerID = playerNumberOf;
    playerNumberOf ++;
  }
}