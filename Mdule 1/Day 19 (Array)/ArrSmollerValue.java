class ArrSmollerValue{
	public static void main(String args[]){
		int[] arr= {12,13, 17, 16, 14,11};
		int Smoll = arr[0];
		for(int i =1; i<arr.length; i++){
			if(Smoll > arr[i]){
				Smoll=arr[i];
			}
			
		}
				System.out.println("The larger value is : " + Smoll);
		
	}
}