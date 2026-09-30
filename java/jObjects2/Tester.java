import java.awt.Rectangle;
public class Tester {
  public static void main(String[] args) { 
      Rectangle box = new Rectangle(5, 10, 10, 10);      
      double w = box.getWidth();
      double h = box.getHeight();
      double area = w * h;
      System.out.print(area); 
  }
}