package Practice;

/*
Напишите Java-программу для сравнения одной строки с
введенной пользователем последовательностью символов.
 */

import java.util.Scanner;

public class Second {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Введите последовательность символов");
    String str1="abcd";
    String str2=s.nextLine();
    if (str2.equals(str1)) {
      System.out.println("Строки совпадают");
    } else {
      System.out.println("Строки не совпадают");
    }
  }

}
