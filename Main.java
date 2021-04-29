import java.util.*;
 public class Main { 
  public static void main(String[] args) {
    Scanner user = new Scanner(System.in);
    
    System.out.println("Enter the width of the livingRoom? ");
     double width = user.nextDouble(); 
    System.out.println("Enter the length of the livingRoom? ");
    double length = user.nextDouble(); 

    Rectangle livingRoom = new Rectangle();
    livingRoom.setLength(length);
    livingRoom.setWidth(width);
    double areaLivingRoom = livingRoom.calculateArea();

System.out.println("Enter the width of the BedRoom? ");
     width = user.nextDouble(); 
    System.out.println("Enter the length of the BedRoom? ");
    length = user.nextDouble(); 

    Rectangle bedroom = new Rectangle();
    bedroom.setWidth(width);
    bedroom.setLength(length);
    double bedroomArea = bedroom.calculateArea();
    double totalArea = bedroomArea + areaLivingRoom;

    System.out.println("Bedroom area: " + bedroom.calculateArea() + " same as " + bedroomArea);
    System.out.println("Bedroom perimiter " + livingRoom.calculatePerimeter());
    
    System.out.println("Living room area: " + livingRoom.calculateArea() + " same as " + areaLivingRoom);
    System.out.println("Living room length: " + livingRoom.getLength());
    
    System.out.println("Total area: " + totalArea);
  }
}

