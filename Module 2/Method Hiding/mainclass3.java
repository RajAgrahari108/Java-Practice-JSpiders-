class delta {
    int val =100;

}
class example extends delta{
    int val = 200;
}


public class mainclass3 {
    public static void main(String[] args) {
        delta ref= new delta();
        System.out.println(ref.val);

        alpha re= new alpha();
        // System.out.println(re.val);

        // delta f= new alpha();
        // System.out.println(f.val);

    }
}
