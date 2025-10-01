class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;

    }
    void setTip(int newTip){
        tip = newTip;
    }
}

public class oops {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.setColor("blue");
        p1.setTip(10);
        System.out.println("");

    }
    
}
