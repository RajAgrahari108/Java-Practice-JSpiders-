class Account
{
	long accNum;
	double accBal;
	void withdrowl(double amt)
	{
		accBal =accBal-amt;
		System.out.println("withdrowl from " +accNum+"Success");
		System.out.println("Available Balance " +accBal);
	}
	void deposite(double amt)
	{
		accBal =accBal+amt;
		System.out.println("deposite to " +accNum+"Success");
		System.out.println("Available Balance " +accBal);
	}
}
class classAndObject_4{
	
	public static void main(String args[]){
		Account a1 = new Account(); 
		a1.accNum=8001514568L;
		a1.accBal = 10000;
		a1.withdrowl(2000.0);
		a1.deposite(500.0);
		
		Account a2 = new Account(); 
		a2.accNum=800151452L;
		a2.accBal = 15000;
		a2.withdrowl(3000.0);
		a2.deposite(1500.0);
		
	}
}
