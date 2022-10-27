public class BotInput {
  Board b;
  int move;
  int[] randomColumn = {2,3,4,5,1,0,6};
  int randomSpace;

  public BotInput(Board b){
    this.b = b;
    this.randomSpace = 0;
  }

  public void getBotInput(){
    move = randomColumn[randomSpace];
    randomSpace++;
  }
}