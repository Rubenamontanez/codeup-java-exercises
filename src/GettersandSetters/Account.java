package GettersandSetters;

public class Account {
    String name;
    int age;

//    [public static]= modifier, [void]=return type,
//    [main]=method type, (String [] args)=[formal paramaters]
    public static void main(String [] args){
// This area Method body where the code goes
        add( 2,3);
        add(1.2f,3.4f);
        add();
        System.out.println(isEven(4));
        isEven(5);
//        System.out.println(add(2,3));
        Account a = new Account();
        a.setName("Pablo");
        a.setAge(34);
        a.printDetails();
        System.out.println(a.getAge());
        System.out.println(a.getName());

    }
//    getters and setters examples
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void printDetails(){
        System.out.println("this is getters and setters");
        System.out.println(name + "," + age);
    }

//    method overloading examples
    private static void add(){
    int sum = 3 + 4;
    System.out.println(sum);
    }
//    private static int add(int a, int b){
//        int sum = a + b;
//        return sum;
//    }
    private static void add(float a, float b){
        float sum = a + b;
        System.out.println(sum);
    }





//    constructors examples
    private static String isEven(int num){
        String str;
//    private static void isEven(int num) {
        if (4 % 2 == 0)
            str = num + " is Even";
//            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
        return str;
    }


}
