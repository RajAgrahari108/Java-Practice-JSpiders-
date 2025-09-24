class Sample{
	int num =10;
	 Sample (){
		System.out.println("constructor of sample");
		num =10;
	}
}
public class Constructor_3{
	public static void main (String Args[]){
	Sample ref = new Sample();
		System.out.println(ref.num);
		
}
}
