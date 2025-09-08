class ArrLargeValue{
	public static void main(String args[]){
		int[] arr= {10,13, 17, 16, 18, 11};
		int large = arr[0];
		for(int i =0; i<arr.length; i++){
			if(large <arr[i]){
				large=arr[i];
			}
			
		}
				System.out.println("The larger value is : " + large);
		
	}
}