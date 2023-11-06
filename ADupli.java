import java.util.*;
public class ADupli{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int []a=new int[s];
    System.out.println("array elements");
    for(int i=0;i<a.length;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("duplicate elements");
    for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[i]==a[j]){
          System.out.println(a[i]);
        }
  }
}
  }
}