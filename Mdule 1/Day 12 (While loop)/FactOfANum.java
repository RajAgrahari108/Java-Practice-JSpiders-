class FactOfANum{
	public static void main(String args[]){
		int a = 10;
		
		int fact = 1;
		while(a>=1){
		fact = fact*a;
			a--;
		}
		System.out.println(fact);
	}
}