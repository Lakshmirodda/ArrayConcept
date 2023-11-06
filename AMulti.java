import java.util.*;
public class AMulti {
  public static void main(String[] args) {
       int[] a={4,3,2,7};
        int[] b={8,6,4,2};
        String result="";
        for (int i=0;i<a.length;i++) {
            result+=Integer.toString(a[i]*b[i])+" ";
        }
        System.out.println("multiply the elements");
        System.out.print(result);
        
  }
}