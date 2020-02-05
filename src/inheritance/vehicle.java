package inheritance;


public class vehicle {
    int numberOfTires;

    public vehicle(int numberOfTires){
        this.numberOfTires =numberOfTires;

    }
    public void go(){
        System.out.println("vehicle:here we go");
    }
    public void report(){
        System.out.println("the number of tires: " + this.numberOfTires);
    }

}
