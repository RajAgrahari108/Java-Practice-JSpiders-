class divisors{
	public static void main(String args[]){
		//int a = 6; 
		int num = 15; 
		int a = 1;
		int b = num/2;
		
		while(a<=b){
			if (num % a==0){
				System.out.println(a);
			}	a++;
			
		}
	}
}