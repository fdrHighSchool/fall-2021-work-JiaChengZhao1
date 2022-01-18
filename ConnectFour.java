import java.util.*;

public class ConnectFour {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String[][] board = new String[6][7];

    System.out.println("\u001B[32mConnect Four!\nPress enter to start.");
    s.nextLine();
    fillBoard(board);
    boolean loop = true;
    int count = 0;
    displayBoard(board);
    while(loop){
      if (count % 2 == 0) dropRedPattern(board);
      else dropYellowPattern(board);
      count++;
      displayBoard(board);
    }


  } // end main method

    public static void dropRedPattern(String[][] board) {
      System.out.println("Drop a red disk at column (0 to 6): ");
      Scanner scan = new Scanner (System.in);
      int c = scan.nextInt();
      for (int i =5;i>=0;i--){
        if (board[i][c] == "[ ]"){
          board[i][c] = "[X]";
          break;
        }
      }
    }

    public static void dropYellowPattern(String[][] board) {
      System.out.println("Drop a O disk at column (0 to 6): ");
      Scanner scan = new Scanner (System.in);
      int c = scan.nextInt();
      for (int i =5;i>=0;i--){
        if (board[i][c] == "[ ]"){
          board[i][c] = "[O]";
          break;
        }
      }
    }

  public static void fillBoard(String[][] board) {
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        board[row][col] = "[ ]";
      } // end inner loop
    } // end outer loop
  } // end fillBoard method

  public static void displayBoard(String[][] board) {
    System.out.println("\u001B[36m"); // clear the terminal \033[H\033[2J
    for(int row = 0; row < board.length; row++) {
      for(int col = 0; col < board[row].length; col++) {
        System.out.print(board[row][col] + " ");
      } // end inner for loop
      System.out.println();
    } // end outer for loop
  } // end displayBoard method


} // end class
