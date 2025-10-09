class Window10{
    void startMenu(){
        System.out.println(" List View");
    }
}
class Window11 extends Window10{
    
    @Override
    void startMenu  (){
        System.out.println("box view ");
    }
}

public class mainclass6 {
    public static void main(String[] args) {
        Window10 ref = new Window11();
        ref.startMenu();
    }
}
