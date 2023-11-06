public class AS{
  public static void main(String[]args){
    int[]a={1,2,3,4,5,67,8};
    int sum=0;
    int avg=0;
    for(int i=0;i<=6;i++){
      sum=sum+a[i];
    }
      avg=sum/6;
    System.out.println("sum = "+sum);
    System.out.println("avg = "+avg);
    }
  }