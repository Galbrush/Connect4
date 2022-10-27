import java.util.Scanner;



public class PlayerInput {
  
  int move;
  Board b;
  Scanner scanner;
  
  public PlayerInput(Board b) {
    scanner = new Scanner(System.in);
    this.b = b;
  }

  public int getPlayerInput() {
    System.out.println("Where do you want to place your counter?");
    move = scanner.nextInt();
    scanner.close();
    return move;
    
  }
}