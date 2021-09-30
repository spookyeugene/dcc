package lab1;

public class task1_9 {

  public static void main(String[] args) {

    int []a = new int[14];
    a[0]=15;
    a[1]=10;
    a[2]=51;
    a[3]=6;
    a[4]=5;
    a[5]=3;
    a[6]=10;
    a[7]=-34;
    a[8]=0;
    a[9]=32;
    a[10]=56;
    a[11]=12;
    a[12]=24;
    a[13]=52;
    System.out.println("Элементы в обратном порядке: ");
    for (int i=a.length-1; i>=0; i--){
      System.out.println(a[i]);
    }

  }

}
