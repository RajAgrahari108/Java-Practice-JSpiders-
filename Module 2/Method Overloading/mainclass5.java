class Whatsapp{
    void deleveryReport(){
        System.out.println(" sent");
    }
}
class Whatsapp1 extends Whatsapp{
    void deleveryReport(){
        System.out.println(" sent -Delever");
    }
}
class Whatsapp2 extends Whatsapp1{
    void deleveryReport(){
        System.out.println(" sent -Delever - seen");
    }
}
public class mainclass5 {
    public static void main(String[] args) {
           Whatsapp w1 = new Whatsapp1();
        w1.deleveryReport();

           Whatsapp1 w2 = new Whatsapp2();
        w2.deleveryReport();

        // Whatsapp w3 = new Whatsapp1();
        // w3.deleveryReport();
    }
}
