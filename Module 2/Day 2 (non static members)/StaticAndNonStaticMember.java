class utilaty
{
	static int p = 10;
	int q = 20;
	static void disp()
	{
		System.out.println("Executing disp()....");	
	}
	void push()
	{
		System.out.println("Executing push()....");	
	}
}
class StaticAndNonStaticMember{
	
	public static void main(String args[]){
		utilaty obj = new utilaty(); 
		System.out.println(utilaty.p);	
		System.out.println(obj.q);	
		
		utilaty.disp();
		obj.push();
	}
}