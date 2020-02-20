package GettersandSetters;

public class Dog{
//    properties String variable
//      All three of these are field vairables
    String breed;
    int age;
    String color;
// getter and setter to print and set the values
    public void setBreed(String breed) {
        this.breed = breed;

    }

    public String getBreed() {
        return breed;
    }

    void bark(){
//        cannot be accessed ib the run method
//          they are local variables local in scope by nature
        int x;
    }
    void run(){
        String x;
    }
    public static void main(String[] args){
        Dog dog1= new Dog();
        dog1.setBreed("pug");
        System.out.println(dog1.getBreed());
    }

//    all of these are instance variables the are reference variables
//    new Dog() creates a new object that references dog1
//    Dog dog1 = new Dog();
//    dog1.breed = pug;
//    dog1.age = 10;
//    dog.color = black;

}
