package lab1;

import java.util.Scanner;

public class task1_6 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Введите число");
    int a = s.nextInt();
    if (a<0){
      System.out.println("Отрицательное число");
    }
    else if(a==0){
      System.out.println("Нулевое число");
    }
    else {
      System.out.println("Положительное число");
    }
  }

}
