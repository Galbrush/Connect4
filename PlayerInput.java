import java.util.Scanner;




public class PlayerInput {
  
  int move;
  Board b;
  Scanner scanner;
  int input;
  Display display;
  
  public PlayerInput(Board b) {
    scanner = new Scanner(System.in);
    this.b = b;
    this.display = new Display(b);
  }

  public int getPlayerInput() {
    display.displayInputPrompt();
    
    if(scanner.hasNextInt()) {
      move = scanner.nextInt();
    } else {
      display.displayInvalidInput(scanner.nextLine());
      
      getPlayerInput();
    }
    return move;
  }
}