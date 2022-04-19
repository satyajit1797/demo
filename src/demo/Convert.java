package demo;

public class Convert 
{
  public static void main(String []args)
  {
	  int days,weeks,months,years;
	  
	  days=1050;
	  years=days/365;
	  days=days%365;
	  months=days/30;
	  days=days%30;
	  weeks=days/7;
	  days=days%7;
	  
	  System.out.print("\n years="+years);
	  System.out.print("\n months="+months);
	  System.out.print("\n weeks="+weeks);
	  System.out.println("\n days="+days);
	  
	  
  }
}
