import java.util.Scanner;
class CharacterVal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the Character : ");
		char ch = sc.next().charAt(0);
		
		System.out.println("Character : " + ch);
		
	}
}