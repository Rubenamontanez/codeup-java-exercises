package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
//    create 2 methods to get area and get perimiter. these arent static methods
    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimiter() {
        return 2 * width + 2 * length;
    }


}
