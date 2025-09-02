class perfect_Num{
	public static void main(String args[]){
		//int a = 6; 
		int num = 6; 
		int a = 1;
		int sum =0;
		
		while(a<=num/2){
			if (num % a==0){
				sum = sum +a;
			}	
			a++;
		}
		if(num ==sum)
		{
			System.out.println(num +"it is prtfect number");
		}
		else
		{
			System.out.println(num + " is not a prtfect number");
			
		}
	}
}