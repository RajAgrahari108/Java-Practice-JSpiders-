class prime_num{
	public static void main(String args[]){
		 
		int num = 23; 
		int a = 1;
		int count =0;
		
		while(a<=num/2)
		{
			if (num % a==0)
			{
				count ++;
			}	
			a++;
		}
		if(count == 1)
		{
			System.out.println(num +"it is prime number");
		}
		else
		{
			System.out.println(num + " is not a prime number");
			
		}
			
		
	}
}