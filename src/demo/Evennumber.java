package demo;
import java.util.Scanner;
public class Evennumber
{
  public static void main(String []args)
  {
	  int a;
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the value");
	  a=sc.nextInt();
	  
	  if(a%2==0)
	  {
		  System.out.println("even");
	  }
	  else
	  {
		  System.out.println("The number is odd");
	  }
  }
}
