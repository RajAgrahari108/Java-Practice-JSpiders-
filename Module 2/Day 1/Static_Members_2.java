class Sample
{
	static int a =40;
	static double b =1.5;
	
	static void play()
	{
		System.out.println("Executing play()....");	
	}
	static void help()
	{
		System.out.println("Executing help()....");
	}
}
public class Static_Members_2
{
	public static void main(String args[])
	{
		System.out.println(Sample.a);
		System.out.println(Sample.b);	
		
		Sample.play();
		Sample.help();
;
			
		
	}
}