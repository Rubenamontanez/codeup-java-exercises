public class MyDemoClass {

    public static void main(String [] args){
        int [] firstSet ={1,4,12,23,10};

        int[] secondSet = new int[5];
        secondSet[0] =1;
        secondSet[1] =4;
        secondSet[2] =7;
        secondSet[3] =5;
        secondSet[4] =10;

        int sum = 0;
        for (int i = 0; i <firstSet.length ; i++) {
             sum = sum + firstSet[i];
            System.out.println(firstSet[i]);
        }
        System.out.println();
        System.out.println(sum);
        System.out.println();
        for (int num :secondSet) {

            System.out.println(num);
        }


        Rectangle r1 =  new Rectangle();
//        r1.width = 10; one way to do it but not clean
//        r1.length = 20;
        r1.setLength(20);
        r1.setWidth(10);
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
        r1.getArea();
        r1.getPerimeter();
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

    }
//    static class TheArrays<myFLoatArray> {
//        float [] myFLoatArray = new float [3];
//        myFLoatArray[0] = 2.3F;
//        myFLoatArray[1] = 17.9F;
//        myFLoatArray[2] = 4.7F;
//        float [] myArray = {2.3F, 17.9F, 4.7F};
//
//    }
 static class Rectangle {
//        float length;
//        float width;
        private float length;
        private float width;


        public float getArea(){
            float area = length * width;
            return area;
        }

        public float getPerimeter(){
            float p = 2 * (length + width);
            return p;
        }

        public float getLength() {
            return length;
        }

        public void setLength(float length) {
            this.length = length;
        }

        public float getWidth() {
            return width;
        }

        public void setWidth(float width) {
            this.width = width;
        }
    }

}
