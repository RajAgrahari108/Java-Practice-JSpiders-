class SearchingArr
{
	public static void main(String args[])
	{
		int[] arr= {12,13, 17, 16, 14,11,22,22,35,25};
		int element = 50;
		boolean flag = false;
		for(int i =1; i<arr.length; i++)
		{
			if(arr[i]==element)
			{
				System.out.println(element+" element is found at index : " + i);
				flag = true;
				
			}
			
		}
		if(flag==false)
		{
				System.out.println("Element is not find : ");
		}
		
	}
}