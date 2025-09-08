class SortingArr
{
	public static void main(String args[])
	{
		int[] arr= {12,13, 17, 16, 14};
		System.out.println("Bfore Sorting: ");
		for(int i =0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		for(int i =1; i<arr.length; i++)
		{
			for(int j =i+1; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
				}
			}
			
		}
		System.out.println("After Sorting: ");
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		 
	}
}