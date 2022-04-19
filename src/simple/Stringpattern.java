package simple;

public class Stringpattern 
{
  public static void main(String []args)
  {
	  String a="SIMPLE";
	  int length=a.length();
	  
	  for(int b=0;b<length;b++)
	  {
		  for(int c=0;c<length;c++)
		  {
			  System.out.print(a.charAt(c)+"");
		  }
	          System.out.println();
		  
	  }
  }
}
