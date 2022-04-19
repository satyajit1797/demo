package simple;
import java.util.Scanner;
public class Invertedstar 
{
	public static void main(String []args)
	{
      int a,b,c,number;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the value of rows");
      number=sc.nextInt();
      
      for(a=number;a>0;a--)
      {
    	 for(b=0;b<number-a;b++)
           System.out.print(" ");
    	 for(c=1;c<(2*a);c++)
    		 System.out.print("*");
    	     System.out.print("\n");
      }
  
  
	} 
}
