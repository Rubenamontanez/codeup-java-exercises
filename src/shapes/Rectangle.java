package shapes;

// TODO: Remove the code from the body of your Rectangle and Square classes.
// TODO: Change your existing Rectangle class to inherit from Quadrilateral and implement Measurable
public class Rectangle extends Quadrilateral implements Measurable{
//    in order extend quadrilateral need to create aconstructor fufilling obligation to quadrilateral
    public Rectangle(double length, double width) {
        super(width, length);
    }

    @Override
    public void setLength(double length) {
        this.length= length;
    }

    @Override
    public void setWidth(double width) {
        this.width= width;
    }

    @Override
    public double getPerimeter() {
        return this.width * this.length;
    }

    @Override
    public double getArea() {
        return 2 * this.width + 2 * this.length;
    }


////    create 2 methods to get area and get perimiter. these arent static methods
//    public double getArea() {
//        return this.width * this.length;
//    }
//
//    public double getPerimiter() {
//        return 2 * width + 2 * length;
//    }
//

}
