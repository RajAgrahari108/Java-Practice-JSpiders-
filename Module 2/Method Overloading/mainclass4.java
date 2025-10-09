class facebookOld{
    void Reaction(){
        System.out.println(" Like");
    }
}
class facebookNew extends facebookOld{
    
    @Override
    void Reaction  (){
        System.out.println("like, wow, haha,Hehe ");
    }
}

public class mainclass4 {
    public static void main(String[] args) {
         facebookOld ref = new facebookOld();
        ref.Reaction();

         facebookNew ref1 = new facebookNew();
        ref1.Reaction();

        facebookOld ref2 = new facebookNew();
        ref2.Reaction();
    }
}
