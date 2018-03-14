package ru.stqa.pft.sandbox;

public class MyFirstPrg {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("bich");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + "=" + r.area());

    Point d = new Point(4, 1,5, 1);
    System.out.println("Расстояние между точками р1 и р2 = " + d.distance());
  }

  public static void hello(String somebody) {

    System.out.println("Hello, " + somebody + "!");
  }

}