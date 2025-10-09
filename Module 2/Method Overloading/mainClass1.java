class Parent{
    void WatchTv(){
        System.out.println("news/serial");
    }
}
class Child{
    
    void WatchTv(){
        System.out.println("movie/serial");
    }
}

public class mainClass1 {
    public static void main(String[] args) {
        
        Parent p=new Parent();
        p.WatchTv();
        
        Child c = new Child();
        c.WatchTv();
    }
}
