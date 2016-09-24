import java.util.*;
import java.lang.*;
public class SumArray
{
   public static void main(String args[])throws ArrayIndexOutOfBoundsException
   {
	   int sum=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of the array");
       int n=sc.nextInt();
       int a[]=new int[n];
       System.out.println("enter "+n+" array elements");
       for(int i=0;i<n;i++)
       {
          a[i]=sc.nextInt();
       }
       for(int j=0;j<n;j++)
       {
          sum=sum+a[j];
       }
       System.out.println("sum of elements in array:"+sum);
    }
}
