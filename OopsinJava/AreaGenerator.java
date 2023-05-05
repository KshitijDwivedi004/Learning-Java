
import java.util.Scanner;

public class AreaGenerator {
    public static void main(String[] args) {

        square sq = new square();
        Rectangle rec = new Rectangle();
        Geometry g = new Geometry();
        g.poly(sq);
        g.poly(rec);
    }

}

abstract class Shape {
    float Area;

    abstract public void input();

    abstract public void compute();

    public void display() {
        System.out.println("The Area is: " + Area);
        System.out.println("--------------------");
    }

}

class square extends Shape {
    float length;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of Side :");
        length = sc.nextFloat();
        // sc.close();

    }

    public void compute() {
        Area = length * length;
    }
}

class Rectangle extends Shape {
    float length;
    float breadth;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of Rectangle :");
        length = sc.nextFloat();
        System.out.println("enter the bredth of Rectangle :");
        breadth = sc.nextFloat();
        // sc.close();

    }

    public void compute() {
        Area = length * breadth;
    }
}

class Geometry {
    public void poly(Shape ref) {
        ref.input();
        ref.compute();
        ref.display();
    }
}
