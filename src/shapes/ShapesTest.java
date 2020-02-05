package shapes;

import java.util.Scanner;


public class ShapesTest {
    public static void main(String [] args){
       Rectangle box1 = new Rectangle(4,5);
        System.out.println(box1.getArea());
        System.out.println(box1.getPerimiter());

        Rectangle box2 = new Square(5);

        System.out.println(box2.getArea());
        System.out.println(box2.getPerimiter());



    }
}
