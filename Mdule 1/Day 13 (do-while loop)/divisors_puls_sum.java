class divisors_puls_sum{
	public static void main(String args[]){
		//int a = 6; 
		int num = 12; 
		int a = 1;
		int sum =0;
		
		while(a<=num/2){
			if (num % a==0){
				sum = sum +a;
			}	
			a++;
		}
		System.out.println("Divisaors sum : " +sum);
	}
}