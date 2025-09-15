class Employ 
{
	String  name ;
	double ctc;
	void work()
	{
		System.out.println("Employ is working the name is : " + name);
	}
	
	void meeting()
	{
		System.out.println(" emplay in meeting the ctc is : " + ctc);
	}
}
class classAndObject_1{
	
	public static void main(String args[]){
		Employ e1 = new Employ(); 
		e1.name ="Ram";
		e1.ctc= 4.5;
		e1.work();
		e1.meeting();
		
		Employ e2 = new Employ(); 
		e2.name ="Krishna";
		e2.ctc= 7.5;
		e2.work();
		e2.meeting();
		
	}
}
