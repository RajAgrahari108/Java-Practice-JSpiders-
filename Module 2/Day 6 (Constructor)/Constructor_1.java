class demo{
	int val =10;
	void test (){
		System.out.println("Execution od test");
		
	}
}
public class Constructor_1{
	public static void main (String Args[]){
	demo ref = new demo();
		System.out.println(ref.val);
		ref.test();
	
}
}
