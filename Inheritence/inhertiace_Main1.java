
class Demo{ 
    int val =100;
    void test(){
        System.out.println("Executinh code");
    }
}

class Sample extends Demo{

}
public class inhertiace_Main1 {
    public static void main(String[] args) {
        Sample obj = new Sample();
        System.out.println(obj.val);
        obj.test();


    }
}
