import java.util.Scanner;

public class Tran {
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of rows :");
  int a=sc.nextInt();
  System.out.println("Enter number of columns:");
  int b=sc.nextInt();
  int [][]s=new int[a][b];
  for(int i=0;i<a;i++){
    for(int j=0;j<b;j++){
      System.out.println("Elements["+(i+1)+","+(j+1)+"]:");
      s[i][j]=sc.nextInt();
    }
  }
  System.out.println("After transpose Matrix ");
  for(int i=0;i<b;i++){
     System.out.println();
    for(int j=0;j<a;j++){
      System.out.print(s[j][i]+"    ");
    }
  }
}
}