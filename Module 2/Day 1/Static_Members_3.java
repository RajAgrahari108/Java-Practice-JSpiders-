class Examples{
	static char ch = 'r';
	static boolean boll = true;
	
	static void disp()
	{
		System.out.println("disp");
	}
	static void send()
	{
		System.out.println("disp");
	} 
	
}
public class Static_Members_3{
public static void main(String args[])
	{
		System.out.println(Examples.ch);
		System.out.println(Examples.boll);	
		
		Examples.disp();
		Examples.send();
			
		
	}
}