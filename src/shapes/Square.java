package shapes;
// TODO: Remove the code from the body of your Rectangle and Square classes.

//TODO:Create a class named Square. that extends Rectangle
public class Square extends Quadrilateral {
//    TODO: Change your existing Square class to extend Quadrilateral.
//     Because the length of all sides of a square are the same,
//     the methods for setting the length and the width should set both protected properties.
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.width = length;
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return Math.pow(this.length,2);
    }


//    public  Square(double side){
//       super(side, side);
//    }
//
//    public double getPerimiter(){
//        double side = super.width;
//        return 4 * side;
//    }
//
//    public double getArea(){
//        double side = super.width;
//            return Math.pow(side,2);
//        }
    }


