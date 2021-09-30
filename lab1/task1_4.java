package lab1;

import java.util.Scanner;

public class task1_4 {

  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Введите число");
    int a = s.nextInt();
    if (a>0) {
      a++;
      System.out.println(a);
    }
    else if (a<0){
      a=a-2;
      System.out.println(a);
    }
    else if (a == 0){
      a=10;
      System.out.println(a);
    }
  }

}
