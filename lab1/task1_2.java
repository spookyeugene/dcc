package lab1;

import java.util.Scanner;

public class task1_2 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Введите трехзначное число");
    int[] a = new int[3];
    int number = s.nextInt();
    for (int i=0; i<3; i++){
      a[i]+=number%10;
      number/=10;
    }
    int sum = a[0]+a[1]+a[2];
    System.out.println("Сумма цифр числа: "+sum);

  }

}
