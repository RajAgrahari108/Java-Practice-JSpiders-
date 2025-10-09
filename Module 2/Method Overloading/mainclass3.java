class Mother{
    void Marrege(){
        System.out.println("Arrange Marrege");
    }
}
class Doughter extends Mother{
    

    void Marrege  (){
        System.out.println("love Marrege");
    }
}
public class mainclass3 {
    public static void main(String[] args) {
        Mother ref = new Doughter();
        ref.Marrege();
    }
}
