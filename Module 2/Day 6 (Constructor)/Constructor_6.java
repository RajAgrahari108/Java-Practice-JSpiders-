class Employee{
	int eid;
	double ctc;
	Employee(int arg1, double arg2)
	{
		eid = arg1;
		ctc = arg2;
	}
	
}
public class Constructor_6{
	public static void main (String Args[]){
		
		Employee e1 =new Employee(101, 5.7);
		System.out.println("Eid : " + e1.eid+"CTC :" + e1.ctc);
		
		Employee e2 =new Employee(102, 4.7);
		System.out.println("Eid : " + e2.eid+"CTC :" + e2.ctc);
	
}
}
