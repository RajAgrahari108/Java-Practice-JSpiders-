nclass program_lastIndexOf{
	public static void main(String args[]){
	
		String str = "Developer";
		System.out.println(str.lastIndexOf('e'));
		
		
		System.out.println(str.lastIndexOf('l'));
		
		System.out.println(str.lastIndexOf('t'));
		
		int a= str.indexOf('e');
		int b= str.indexOf('e', a-1);
		int c= str.indexOf('e', b-1);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
		
	}
}