import java.util.*;

public class CoordinatePlane{
  public static void main(String[]args) {
    Scanner s = new Scanner(System.in);

    System.out.print("enter a coordinate (x, y): ");
    String point1 = s.nextLine();

    System.out.println(point1);

   System.out.print("enter another coordinate (x, y): ");
    String point2 = s.nextLine();

    System.out.println(point2);
    //x1
    int commaPosition = point1.indexOf(",");//2
    String x1 = point1.substring(1, commaPosition);
    int Ex1 = Integer.parseInt(x1);

    //y1
    int commaPosition3 = point1.indexOf(")");//2
    String y1 = point1.substring(3, commaPosition3);
    int Ex3 = Integer.parseInt(y1);

    //x2
    int commaPosition2 = point2.indexOf(",");
    String x2 = point2.substring(1, commaPosition2);
    int Ex2 = Integer.parseInt(x2);
    //y2
    int commaPosition4 = point2.indexOf(")");//2
    String y2 = point2.substring(3, commaPosition4);
    int Ex4 = Integer.parseInt(y2);

     System.out.println("x1= " + Ex1 + " y1= " + Ex3 + " x2= " + Ex2 + " y2= " +Ex4);


    //Integer.parseInt(x1)


  }
}
