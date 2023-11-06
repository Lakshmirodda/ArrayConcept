import java.util.*;
public class ASE {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] a=new int[6];
    a[0]=1;
    a[1]=2;
    a[2]=30;
    a[3]=4;
    a[4]=50;
    a[5]=6;
    Arrays.sort(a);
     System.out.println("minimum element");
    System.out.println(a[0]);
     System.out.println("maximum element");
     System.out.println(a[5]);
    System.out.println("second largest element");
    System.out.println(a[4]);
  }
}