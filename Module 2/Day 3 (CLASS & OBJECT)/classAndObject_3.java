class Bike
{
	int cc;
	double milage;
	void drive()
	{
		System.out.println("driving bike in cc : "+cc);
	}
	
	void travel()
	{
		System.out.println(" travling in bike eith milage "+milage);
	}
}
class classAndObject_3{
	
	public static void main(String args[]){
		Bike b1 = new Bike(); 
		b1.cc = 150;
		b1.milage = 45.0;
		b1.drive();
		b1.travel();
		
		Bike b2 = new Bike(); 
		b2.cc = 150;
		b2.milage = 45.0;
		b2.drive();
		b2.travel();
	}
}
