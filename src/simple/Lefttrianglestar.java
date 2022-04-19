package simple;
import java.util.Scanner;
public class Lefttrianglestar 
{
  public static void main(String []args)
  {
	  int a,b,number;
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the value of rows");
	  number=sc.nextInt();
	  
	  for(a=0;a<=number;a++)
	  {
		  for(b=1;b<(2*a);b++)
			  System.out.print("*");
		      System.out.print("\n");
	  }
  }
}
