class Pen{
    String color ="blue";
    int tip = 16;
    void setColor(String newColor){
        color = newColor;

    }
    void setTip(int newTip){
        tip = newTip;
    }
}
public class oops_2 {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}
