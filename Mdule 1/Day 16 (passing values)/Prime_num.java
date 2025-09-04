class Prime_num
{
	static boolean findPrimeNum(int n){
		int a = 1;
		int count = 0;
		while(a <= n/2){
			if(n % a==0){
				count++;
			}
			a++;
		}
		if(count == 1){
			return true;
		}else{
			return false;
		}
		
	}
	public static void main(String [] args){
		for(int i=1; i<=100; i++){
			boolean status = findPrimeNum(i);
			if(status==true){
			System.out.println(" Prime num is : " +(i));
				
			}
			
		}
	}
}