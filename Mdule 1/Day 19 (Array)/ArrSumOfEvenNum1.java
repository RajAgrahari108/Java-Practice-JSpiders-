class ArrSumOfEvenNum5{
	public static void main(String args[]){
		double[] arr= {5.8,5.9, 5.8, 5.5, 5.7, 5.9};
		double sum  = 0;
		for(int i =0; i<arr.length; i++){
			if(arr[i] %2 ==0){
				sum = sum  + arr[i];
			}
			
			
		}
		 System.out.println("The sum of All even number is : " + sum);
		
	}
}