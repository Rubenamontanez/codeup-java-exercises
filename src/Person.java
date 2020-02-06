
public class Person {

//    firstName and lastName are both instance variables(((PROPERTIES)))
    public String firstName;
    public String lastName;

//    sayHello is an instance method
    public String sayHello() {
//    in the sayHello method we can refer to firstName and lastName,
//    despite them having variables with those names defined in the method
        return String.format("Hello from %s %s!", firstName, lastName);
    }

}


//    private String name;
//    private String FirstName;
//    private String LastName;
//
//
//    public Person(String name) {
//        this.name = name;
//    }
//    public Person(Person aPerson) {
//        this.setFirstName(aPerson.FirstName);
//        this.setLastName(aPerson.LastName);
//    }
//
//
//    // returns the person's name
//    public String getName() {
//        return this.name;
//    }
//
//    // changes the name property to the passed value
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    // prints a message to the console using the person's name
//    public void sayHello() {
//        System.out.println("Hi, my name is: " + name);
//    }
//
//    public static void main(String[] args) {
//        Person ruben = new Person("Ruben");
//        ruben.sayHello();
//        Person person1 = new Person("John");
//        Person person2 = new Person("Chris");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);
//    }
//
//    public void setFirstName(String FirstName) {
//        this.FirstName = FirstName;
//    }
//
//    public String getFirstName() {
//        return FirstName;
//    }
//
//
//    public void setLastName(String lastName) {
//        this.LastName = LastName;
//    }
//
//    public String getLastName() {
//        return LastName;
//    }
//}




