class  delta
{
	int a = 50;
	void test()
	{
		System.out.println("Executing trst()....");	
	}
}
class NonStaticMember{
	public static void main(String args[]){
		System.out.println(new delta().a);	
		new delta().test();
	}
}