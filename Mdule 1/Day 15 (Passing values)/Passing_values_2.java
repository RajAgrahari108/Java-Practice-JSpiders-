class Passing_values_2{
	static void help(boolean bool){
		System.out.println("Value Passed :" + bool);
		
	}
	static void disc(char ch){
		System.out.println("passed value :" + ch);
		help(true);
	}		
	
	public static void main(String [] args){
		
		disc('R');
		
		
	}
}