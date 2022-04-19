package simple;
import java.util.Scanner;
public class NumPyramid 
{
  public static void main(String []args)
  {
	  int a,b,c,rows;
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the value of rows");
	  rows=sc.nextInt();
	  
	  for(a=1;a<=rows;a++);
	  {
		  for(b=a;b<=rows-1;b++)
		  
			  System.out.print(" ");
		  
		  for(c=1;c<(a*2);c++)
		  
			  System.out.print(c+"");
		      System.out.print("\n");
		  
	  }
  }
}
