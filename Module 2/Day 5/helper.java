class helper
{
	 double val;
	
	
	{
		val=3.0;
	}
	{
		val=6.0;
	}

	{
		val=9.0;
	}
	public static void main(String args[]){
		
		System.out.println("Start");
		helper ref = new helper();
		System.out.println(ref.val);
		System.out.println("End");

	}
}