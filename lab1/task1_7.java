package lab1;

import java.util.Scanner;

public class task1_7 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Введите код города");
    int code = s.nextInt();
    System.out.println("Введите время разговора");
    double time = s.nextDouble();
    if (code==905){
      System.out.println("Москва. Стоимость разговора: "+4.15*time);
    }
    else if (code==194){
      System.out.println("Ростов. Стоимость разговора: "+1.98*time);
    }
    else if (code==491){
      System.out.println("Краснодар. Стоимость разговора: "+2.69*time);
    }
    else if (code==800){
      System.out.println("Киров. Стоимость разговора: "+5.00*time);
    }
  }

}
