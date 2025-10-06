class  Beta
{
	char p = 'r';
	boolean q = true;
	void disp()
	{
		System.out.println("Executing disp()....");	
	}
	void push()
	{
		System.out.println("Executing push()....");	
	}
}
class NonStaticMember2{
	
	public static void main(String args[]){
		Beta ref = new Beta(); 
		System.out.println(ref.p);	
		System.out.println(ref.q);	
		
		ref.disp();
		ref.push();
	}
}