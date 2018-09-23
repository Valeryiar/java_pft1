package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {


    Square s = new Square(5);

    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);

    System.out.println("Площадь прямоугольника со стороной " + r.a + " и " + r.b + " = " + r.area());

    Point A = new Point(10, 12);
    Point B = new Point(3, 4);
    System.out.println("A.distance(B) = " +
            A.distance(B));



  }
}
