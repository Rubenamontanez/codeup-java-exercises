import java.util.Date;

public class students {
    static int numberOfStudents = 0;
     String name;
    String cohort;
    private Date startDate;
    String program;
    String location;
    boolean drinksCoffee;

    public static void main(String[] args) {
        students ruben = new students("Ruben");
//        ruben.name = "Ruben";
        ruben.cohort = "Europa";
        ruben.startDate = new Date ("06/11/2018");
        ruben.program = "web development";
        ruben.location = "San Antonio";

//        william.cohort = "Europa"
        students william = new students("william");
//        william.name = "William";
        william.cohort = "bayes";
        william.startDate = new Date("February 11,2017");
        william.program = "Data Science";
        william.location = "San Antonio";
        william.drinksCoffee = false;
        ruben.drinksCoffee = true;

        ruben.report();
        william.report();
        System.out.printf("there are now %d\n", numberOfStudents);


//        System.out.println(william.report());
//            if (william.drinksCoffee)
//                System.out.println(william.name);
//        System.out.println(william.name + " drinks coffee.");
    }

        public students (String name){
            numberOfStudents ++;
            this.name = name;
            this.startDate = new Date();
        }

        public void report(){
            String output = "";
                output += "my name is " + this.name + "."   ;
                output += "I started learning " + this.program + " with " + this.cohort + " on " + this.startDate + ".";
                if (this.drinksCoffee)
                    output += "i drink coffee in " + this.location + ".";
                else
                    output += "i dont drink coffee in " + this.location + ".";
            System.out.println(output);
        }



}

//static belong to the class of student