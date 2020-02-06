package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {

    static HashMap<String, Student> students = new HashMap<>();
    static Input input = new Input();

    public static void main(String[] args) {

        Student zgulde = new Student("zach");
        zgulde.addGrade(100);
        zgulde.addGrade(80);

        Student ryanorsinger = new Student("Ryan");
        ryanorsinger.addGrade(100);
        ryanorsinger.addGrade(80);

        Student jreich5 = new Student("Justin");
        jreich5.addGrade(100);
        jreich5.addGrade(80);

        Student fernando = new Student("Fernando");
        fernando.addGrade(100);
        fernando.addGrade(60);


        Student luis = new Student("Luis");
        luis.addGrade(100);
        luis.addGrade(50);

        students.put("zgulde", zgulde);
        students.put("ryanorsinger", ryanorsinger);
        students.put("jreich", jreich5);
        students.put("fmendozaro", fernando);
        students.put("MontealegreLuis",luis);


        System.out.println("Welcome!\n");

        showStudents();

        boolean cont = true;

        do{

            String key = input.getString("What student would you like to see more information on?\n");

            if(students.containsKey(key)){
                System.out.println("Name: "+ students.get(key).getName() +" - GitHub Username: " + key );
                System.out.println("Current Average: " + students.get(key).getGradeAverage());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + key);
            }

            cont = input.yesNo("Would you like to see another student? yes or no");

        }while(cont);

        System.out.println("Goodbye, and have a wonderful day!\n");

    }

    public static void showStudents(){
        System.out.println("Here are the GitHub usernames of our students:\n");
        for (String username : students.keySet()) {
            System.out.print("|" + username + "| ");
        }
        System.out.println();
    }
}