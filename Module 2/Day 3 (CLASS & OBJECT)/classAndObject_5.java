class LoginPage
{
	String username;
	String password;
	void login()
	{
		System.out.println("Login with username and password");
	}
	void createAccount()
	{
		System.out.println("Redirect to sign up page");
	}
	void forgotPassword()
	{
		System.out.println("Password recovery options");
	}
}

public class classAndObject_5
{
	public static void main(String[] args)
	{
		LoginPage l1=new LoginPage();
		l1.username="Kumar";
		l1.password="Kumar1234";
		l1.login();
		System.out.println("------------------------------------");
		
		LoginPage l2=new LoginPage();
		l2.username="Raja";
		l2.forgotPassword();
		
		LoginPage l3=new LoginPage();
		l3.createAccount();
		
	}
}