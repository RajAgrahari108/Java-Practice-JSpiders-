class program_equals_equalsIgnoreCase{
	public static void main(String args[]){
	
		String str = "Developer";
		
		System.out.println(str.equals("Developere"));
		System.out.println(str.equals("developer"));
		System.out.println(str.equals("Developer"));
		
		System.out.println(str.equalsIgnoreCase("Developere"));
		System.out.println(str.equalsIgnoreCase("developer"));
		System.out.println(str.equalsIgnoreCase("Developer"));
		
		
		
		
		
	}
}