class Passing_Colling_values_2{
	static double Addit(double a1, double a2){
		double sum  = a1+ a2;
		return sum;
	}
	public static void main(String args[]){
		double res = Addit(20, 23);
		
		System.out.println("Result : " +res);
		
		System.out.println("Result : " +Addit(2.3, 2.8));
		System.out.println("Result : " +Addit(29.2, 2.8));
		System.out.println("Result : " +Addit(23, 2.8));
		System.out.println("Result : " +Addit(2.3, 28));
		
	}
}