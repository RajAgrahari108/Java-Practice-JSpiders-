class program_split{
	public static void main(String args[]){
	
		String str = "Developer Jspiders Raj Agrahari Gupta";
		
		String[] arr = str.split(" ");
		for(int i=0; i<arr.length; i++){
		System.out.println(arr[i]);	
		}
	}
}