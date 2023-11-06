public class AC{
  public static void main(String[]args){
    int[]a={1,2,3,4,5,67,8};
    int even=0;
    int odd=0;
    for(int i=0;i<=6;i++){
      if(a[i]%2==0){
        even++;
      }
      else
      {
        odd++;
      }
    }
      System.out.println("even count = "+even++);
    System.out.println("odd count = "+odd++);
    }
  }