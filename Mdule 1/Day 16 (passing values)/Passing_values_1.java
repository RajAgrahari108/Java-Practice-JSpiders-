class Passing_values_1{
	static boolean verify(int arg){
		if(arg % 2 == 0){
			return true;
		}else{
			return false;

		}
	}
	public static void main(String args[]){
		boolean  flag = verify(20);
		System.out.println("Result : " + false);
	}
}