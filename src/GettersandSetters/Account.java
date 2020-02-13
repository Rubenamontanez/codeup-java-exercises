package GettersandSetters;

public class Account {
    String name;
    int age;
    public static void main(String [] args){

        Account a = new Account();
        a.setName("Pablo");
        a.setAge(34);
        System.out.println(a.getAge());
        System.out.println(a.getName());
        a.printDetails();

    }
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
        System.out.println(name + "," + age);
    }

}
