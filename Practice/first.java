package Practice;

import java.util.Scanner;

/*
Создать программу, которая будет сообщать, является ли целое число,
введённое пользователем, чётным или нечётным.
Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */

public class first {

  public static void main(String[] args) {
    System.out.println("Введите целое число");
    Scanner scn=new Scanner(System.in);
    if(scn.hasNextInt()){
      if(scn.nextInt()%2==0){
        System.out.println("Число четное!");
      }
      else System.out.println("Число не четное!");
    }
    else System.out.println("Ошибка. Вы ввели не целое число");
  }
}
