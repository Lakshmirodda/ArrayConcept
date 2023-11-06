import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String a="welcome to java";
	    String[]b=a.split(" ");
	    System.out.println(Arrays.toString(b));
	    int[]c={10,2,8,4};
	    Arrays.parallelSort(c);
	    System.out.println(Arrays.toString(c));
	    int[]d={1,2,3};
	    int[]e={1,2,5};
	    int mismatch=Arrays.mismatch(d,e);
	    System.out.println("mismatch index is :"+mismatch);
	    Arrays.parallelPrefix(c,(x,y)->x+y);
	    System.out.println(Arrays.toString(c));
	    int[]g=new int[10];
	    Arrays.setAll(g,i->i*i);
	    System.out.println(Arrays.toString(g));
	    Arrays.parallelSetAll(g,i->i*i*i);
         System.out.println(Arrays.toString(g));
		}
	}
