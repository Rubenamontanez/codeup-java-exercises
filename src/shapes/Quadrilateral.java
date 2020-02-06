package shapes;
// need to do extend before implement
// abstract knows what it need and expects descendants to take care of it
// TODO: Inside of shapes, create an abstract Quadrilateral class that extends
//  Shape and implements Measurable. This class should have:
 abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

//   TODO: a constructor that accepts two numbers for the length and width and sets those properties.
    public Quadrilateral(double width, double length){
        this.width = width;
        this.length = length;
    }
//    TODO: methods for getting the length and width
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
//  TODO: abstract methods for setting the length and width
    //    implementation removed
    public abstract void setLength(double length);
    public abstract void setWidth(double width);
}


//        public double getArea() {
//        return this.width * this.length;
//    }
//
//    public double getPerimeter() {
//        return 2 * width + 2 * length;
//    }