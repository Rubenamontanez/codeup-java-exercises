package shapes;


//TODO:Create a class named Square. that extends Rectangle
public class Square extends Rectangle  {


    public  Square(double side){
       super(side, side);
    }

    public double getPerimiter(){
        double side = super.width;
        return 4 * side;
    }

    public double getArea(){
        double side = super.width;
            return Math.pow(side,2);
        }
    }


