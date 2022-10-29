import java.util.Scanner;




public class PlayerInput {
  
  int move;
  Board b;
  Scanner scanner;
  int input;
  
  public PlayerInput(Board b) {
    scanner = new Scanner(System.in);
    this.b = b;
  }

  public int getPlayerInput() {
    System.out.println("Where do you want to place your counter?");
    
    if(scanner.hasNextInt()) {
      move = scanner.nextInt();
    } else {
      System.out.println(scanner.nextLine() + " is not a valid input. Please provide a valid column number.");
      getPlayerInput();
    }
    return move;
  }
}