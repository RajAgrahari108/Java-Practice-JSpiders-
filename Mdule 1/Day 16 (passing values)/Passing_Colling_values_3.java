class Passing_Colling_values_3
{
	static int square(int num){
		int result = num *num;
		return result;
	}
	public static void main(String [] args){
		for(int i=1; i<=5; i++){
			System.out.println(i+" Square is : " + square(i));
		}
	}
}