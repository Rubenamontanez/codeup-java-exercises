package inheritance;

public class inheritanceTest {
    public static void main(String[] args){
        vehicle[] garage = new vehicle[2];

        vehicle vehicle1 = new vehicle(2);
        vehicle1.go();
        vehicle1.report();
        garage[0] = vehicle1;

        car car1 = new car();
        car1.go();
        car1.report();
        garage[1] = car1;

        System.out.println(garage);
    }
}
