import java.util.*;
public class ReverseArray
{
   public static void main(String args[])
   {
	   
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of the array");
       int n=sc.nextInt();
       Reverse r=new Reverse();
	   
       int a[]=new int[n];
       System.out.println("enter "+n+" array elements");
       for(int i=0;i<n;i++)
       {
          a[i]=sc.nextInt();
       }
       int c[]=r.reverseN(a,n);
       for(int i=0;i<n;i++)
       {
          System.out.println(c[i]);
       }
   }
}
