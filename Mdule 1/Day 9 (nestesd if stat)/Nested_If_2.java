 class Nested_If_2{
	 public static void main(String [] args){
		 double accBal = 10000.0;
		 int amt = 20;
		 
		 if(amt <= accBal )
		 {
			 if(amt % 100 == 0  )
			{
			 System.out.println("Withdrawal successfully");
			}
			else
			{
			 System.out.println("Invalid Denaomination");
			}
		 }
		 else 
			{
			 System.out.println("Insufficient Balance");
			}
		 
	 }
 }