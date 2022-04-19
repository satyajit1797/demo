package simple;
import java.util.Scanner;
public class Invertedtriangle 
{
  public static void main(String []args)
  {
	  int a,b,number;
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the value of rows");
	  number=sc.nextInt();
	  
	  for(a=number;a>0;a--)
	  {
		  for(b=a;b<(2*a);b++)
		  System.out.print("*");
		  System.out.print("\n");
	  }
  }
}
