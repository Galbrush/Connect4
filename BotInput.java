public class BotInput {
  Board b;
  int move;
  int[] randomColumn = {3,4,5,6,2,1,7};
  int randomSpace;

  public BotInput(Board b){
    this.b = b;
    this.randomSpace = 0;
  }

  public int getBotInput(){
    move = randomColumn[randomSpace];
    randomSpace++;
    if(randomSpace>6) {
      randomSpace = 0;
    }
    return move;
  }
}