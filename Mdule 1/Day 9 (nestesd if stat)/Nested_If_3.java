class Nested_If_3{
	public static void main(String args[]){
		char gender = 'M';
		int age = 23;
		if(gender == 'M')
		{
			if(age >= 21)
			{
				System.out.println("Elegibal Bechalor");
				
			}
			else
			{
				System.out.println("under agr");
				
			}
		}else if (gender == 'F')
		{

			if(age >= 18)
			{
				System.out.println("Elegibal spinster");
				
			}
				else
			{
				System.out.println("under agr");
				
			}
			
		}	else
			{
				System.out.println("Invalid Gender");
			
			}
	}
}