public class AM{
  public static void main(String[]args){
    int[]a={1,2,3,4,5,67,8};
    int max=a[0];
    int min=a[0];
    for(int i=0;i<=6;i++){
      if(max<a[i]){
        max=a[i];
      }
      if(min>a[i]){
        min=a[i];
      }
    }
      System.out.println("max value = "+max);
    System.out.println("min value = "+min);
    }
  }