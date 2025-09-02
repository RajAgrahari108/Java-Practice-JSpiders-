class percentageOpr{
	public static void main(String []agrs){
		double percentage = 65.9;
		if(percentage > 90){
			System.out.println("Topper of the class");
		}else if(percentage > 70 && percentage < 90)
		{
			System.out.println("first class");
		}
		else if(percentage > 50 && percentage < 70)
		{
			System.out.println("Second class");
		}
		else if(percentage > 70 && percentage < 34)
		{
			System.out.println("Average");
		}
		else {
			System.out.println("Fail Class");
		}
	}
}