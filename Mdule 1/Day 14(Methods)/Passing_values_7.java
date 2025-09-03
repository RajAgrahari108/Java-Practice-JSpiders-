class Passing_values_7{
	static char Send(){
		return 'R';
	}
	public static void main(String args[]){
		char ch = Send();
		System.out.println("Returning value : " + ch);
		System.out.println("Returning value : " + Send());
		
	}
	
}