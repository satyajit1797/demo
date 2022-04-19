package simple;
import java.util.Scanner;
public class Star
{
	public static void main(String []args)
	{
	int i,j,k,number;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of layers for pyramid");
	number=sc.nextInt();
	
	for(i=1;i<=number;i++)
	{
		for(j=i;j<=number-1;j++)
			System.out.print(" ");
		for(k=1;k<(i*2);k++)
			System.out.print("*");
		    System.out.print("\n");
	}
	}
}