class ArrSumOfEvenNum5{
	public static void main(String args[]){
		double[] arr= {5.8,5.9, 5.8, 5.5, 5.7, 5.9,5.6};
		double sum  = 0.0;
		for(int i =0; i<arr.length; i++){
			sum = sum +arr[i];	
		}
		 System.out.println("The sum number is : " + sum);
		
	}
}