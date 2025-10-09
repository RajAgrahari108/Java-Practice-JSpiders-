
class demo{
    char ch =  'j';
    void help(){
        System.out.println("Executing help .....");
    }
}
class semple{
    demo d = new demo();
}

public class Exaplme {
    public static void main(String[] args) {
        semple s= new semple();
        System.out.println(s.d.ch);
        s.d.help();

    }
}
