package Vehicle;
// to make use of interface need the implement word
// need impl
public class Car implements Vehicle {
    public void go(double miles){
        System.out.println("Go, vroom for "+ miles+" miles");
    }

    @Override
    public void method1() {

    }

    @Override
    public void method2(int num) {

    }

    @Override
    public void method3(String message) {

    }
}
