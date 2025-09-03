class Passing_values_5{
	static int test(){
		return 25;
	}
	public static void main(String args[]){
		int val = test();
		System.out.println("Returning value : " + val);
		System.out.println("Returning value : " + test());
		
	}
	
}