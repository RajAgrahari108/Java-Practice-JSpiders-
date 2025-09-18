class utility
{
	char ch ;
	{
		System.out.println("Eexcuting non static block");
		ch ='A';
	}
	public static void main(String args[]){
		
		System.out.println("Start");
		utility ref = new utility();
		System.out.println(ref.ch);
		System.out.println("End");

	}
	
}