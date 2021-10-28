import java.util.*;

public class CoordinatePlane{
  public static void main(String[]args) {
    Scanner s = new Scanner(System.in);

    System.out.print("enter a coordinate (x, y): ");
    String point1 = s.nextLine();

    System.out.println(point1);

    // System.out.print("enter another coordinate (x, y): ");
    // String point2 = s.nextLine();
    //
    // System.out.println(point2);

    int commaPosition = point1.indexOf(",");
    String x1 = point1.substring(1, commaPosition);
    int Ex1 = Integer.parseInt(x1);
    System.out.println(Ex1 + 1);
    //Integer.parseInt(x1)

    int 

  }
}
