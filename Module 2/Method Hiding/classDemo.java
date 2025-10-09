
class Engine{
    void poewr(){
        System.out.println("Engine provide power");
    }
}

class Driver{
    void driver(){
        System.out.println("drover id driving");
    }
}

class Car{
    Engine eng = new Engine();
    Driver dr;
    Car(Driver dr){
        this.dr = dr;
    }
}
    public class classDemo {
    public static void main(String[] args) {
        Driver d = new Driver();
        Car c = new Car(dr);
        c.eng.poewr();
        c.dr.driver();


    }
}
