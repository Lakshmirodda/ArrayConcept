import java.util.*;
public class AMethods {
  public static void main(String[] args) {
    int[] a={1,6,3,9,12};
    int[] b={5,8,3,2,9};
    System.out.println(a);
    System.out.println("by using tostring method");
    System.out.println(Arrays.toString(a));
    Arrays.sort(a);
    System.out.println("by using sort method");
    System.out.println(Arrays.toString(a));
    System.out.println("by using binary search method");
    System.out.println(Arrays.binarySearch(a,2));
    System.out.println("by using copy of method");
    System.out.println(Arrays.toString(Arrays.copyOf(a,9)));
    System.out.println("by using copyof range method");
    System.out.println(Arrays.toString(Arrays.copyOfRange(a,2,5)));
    Arrays.fill(a,56);
    System.out.println("by using fill method");
    System.out.println(Arrays.toString(a));
    System.out.println("by using equals method");
    System.out.println(Arrays.equals(a,b));
    Integer c[]={3,5,7,9};
    List<Integer> d=Arrays.asList(c);
    System.out.println("by using aslist method");
    System.out.println(d);
    int[] e={56};
    System.out.println("by using hashcode method");
    System.out.println(Arrays.hashCode(e));
    
    
    
}
}