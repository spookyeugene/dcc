package lab1;

import java.util.Scanner;

public class task1_5 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Введите первое число");
    int a = s.nextInt();
    System.out.println("Введите второе число");
    int b = s.nextInt();
    System.out.println("Введите третье число");
    int c = s.nextInt();
    if ((a<b) && (a<c)){
      System.out.println("Наименьшее из чисел: "+a);
    }
    else if((b<c)&&(b<a)){
      System.out.println("Наименьшее из чисел: "+b);
    }
    else if((c<a)&&(c<b)){
      System.out.println("Наименьшее из чисел: "+c);
    }
  }

}
