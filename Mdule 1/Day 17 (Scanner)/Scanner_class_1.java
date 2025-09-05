import java.util.Scanner;
class Scanner_class_1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter tha number :");
		int n= sc.nextInt();
		
		if(n %2 ==0)
		{
		System.out.println(n + " is even ");
		}
		else
		{
		System.out.println(n + " is odd ");
		}
	
	}
}