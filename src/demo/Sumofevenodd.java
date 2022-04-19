package demo;

import java.util.Scanner;
public class Sumofevenodd
{
  public static void main(String []args)
  {
	  int a,number;
	  int sum=0;
	  int sum1=0;
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the value");
	  number=sc.nextInt();
	  
	  
	  
	  for(a=0;a<=number;a++)
	  {
		  if(a%2==0)
		   
		  {
			  sum=sum+a;
			  
		  }
		  else
			  
		  {
			  sum1=sum1+a;
			  
		  }
		  
	  }
	  System.out.println("sum of even numbers are="+sum);
	  System.out.println("sum of odd numbers are="+sum1);
  }
}
