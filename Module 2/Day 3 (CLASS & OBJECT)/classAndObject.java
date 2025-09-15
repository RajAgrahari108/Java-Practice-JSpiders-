class student 
{
	int  id ;
	double cgpa;
	void write()
	{
		System.out.println(id +" is writing");
	}
	
	void listen()
	{
		System.out.println(" student having cgpa: " + cgpa);
	}
}
class classAndObject{
	
	public static void main(String args[]){
		student s1 = new student(); 
		s1.id=101;
		s1.cgpa = 7.8;
		s1.write();
		s1.listen();
		
		student s2 = new student(); 
		s2.id=102;
		s2.cgpa = 7.9;
		s2.write();
		s2.listen();
		
		
			
		
		
	}
}
