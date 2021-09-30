package lab1;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class task1_10 {

  public static void main(String[] args) {
    int[] a = new int[14];
    a[0] = 15;
    a[1] = 10;
    a[2] = 0;
    a[3] = -6;
    a[4] = -5;
    a[5] = 3;
    a[6] = 0;
    a[7] = -34;
    a[8] = 0;
    a[9] = 32;
    a[10] = 56;
    a[11] = 0;
    a[12] = 24;
    a[13] = 52;
    int left = 0, right = 13;
    while(left<right){
      if (a[left]!=0)
        left++;
      if(a[right]==0)
        right--;
      if (a[left]==0 && a[right]!=0) {
        a[left]=a[left]+a[right]-(a[right]=a[left]);
        left++;
        right--;
      }
    }
    for (int i = 0; i < 14; i++) {
      System.out.print(a[i]+" ");
    }
      }
    }
