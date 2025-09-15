class Mobile 
{
	String  model;
	double Price;
	void coll()
	{
		System.out.println("coll in : "+model);
	}
	
	void message()
	{
		System.out.println(" message in "+model +"is price is:" +Price);
	}
}
class classAndObject_2{
	
	public static void main(String args[]){
		Mobile m1 = new Mobile(); 
		m1.model ="iphone17";
		m1.Price= 1.95;
		m1.coll();
		m1.message();
		
		Mobile m2 = new Mobile(); 
		m2.model ="s25 ultra";
		m2.Price= 1.4;
		m2.coll();
		m2.message();
		
	}
}
