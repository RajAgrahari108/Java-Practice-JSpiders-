class Father{
    void motorCycle(){
        System.out.println("normal");
    }
}
class Sun extends Father{
    

    void motorCycle  (){
        System.out.println("Abnormal");
    }
}

public class mainClass2 {
    public static void main(String[] args) {
        
        // Father p=new Father();
        // p.motorCycle();
        
        // Sun c = new Sun();
        // c.motorCycle();

        Father ref = new Sun();
        ref.motorCycle();
    }
}
