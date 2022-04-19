package simple;
import java.util.Scanner;
public class Numsqupatt 
{
  public static void main(String []args)
  {
	  int a,b,rows;
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the no. of rows");
	  rows=sc.nextInt();
	  
	  for(a=1;a<=rows;a++)
	  {
		 for(b=1;b<=rows;b++)
		 
			if(b<=a)
			
				System.out.print(a+"");
			
			else
			
				System.out.print(b+"");
			    System.out.print("\n");
		 
	  }         
  }
}
