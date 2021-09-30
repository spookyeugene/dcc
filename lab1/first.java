package lab1;
import java.util.Scanner;

public class first {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Введите число");
    int a = s.nextInt();
    System.out.println("Последняя цифра числа: " + a % 10);

  }
}
