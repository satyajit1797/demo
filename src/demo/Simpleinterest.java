package demo;

public class Simpleinterest 
{
   public void m1()
   {
	   int a=15000;
	   System.out.println("Enter the value of main amount="+a);
	   double b=11.20;
	   System.out.println("Enter the value of Interest rate="+b);
	   int c=3;
	   System.out.println("Enter the value of total period="+c);
	   double d;
	   d=a*b*c/100;
	   System.out.println("Simple Interst is="+d);
	   
   }
      public static void main(String []args)
      {
    	  Simpleinterest s=new Simpleinterest();
    	  s.m1();
      }
}
