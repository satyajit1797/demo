package simple;
import java.util.Scanner;
public class Numtriangle 
{
  public static void main(String []args)
  {
	  int a,b,c,rows;
	  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the value of rows");
	  rows=sc.nextInt();
	  
	 for(a=1;a<=rows;a++)
	 {
		 for(b=1;b<=a;b++)
		 {
			 System.out.print(b+"");
		 }
		    System.out.println();
	 }
		  
  
}
}