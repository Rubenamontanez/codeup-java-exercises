import java.util.Scanner;


public class HighLow {
    public static void main(String[] args) {
        int enemyHealth = 10;
        int heroHealth = 10;
        String commandAttack;
        adventure();
    }


    public static void adventure() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wanna play a game?");
        System.out.print("Y or N" +
                ": ");
        String answer = scan.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            letsStart();
        } /*line 16*/ else {
            System.out.println("goodbye");
        }

    }  /* public static void adventure(){*/


    public static void letsStart() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nGreat!");
        System.out.println("whats your name?");
        String playerOne = scan.nextLine();
        System.out.println("Alright, " + playerOne + " lets go kill this guy!");
        int badGuy = 10;
        do {
            System.out.print("What Skill do you want to use?"
                    + "\n Fight or Run: ");
            String commandAttack = scan.next();
            System.out.println(commandAttack);
            if(commandAttack.equals("run")){
                System.out.println("If your scared i dont need you: goodbye");
                System.out.println("             _  ");
                System.out.println("           _( }  ");
                System.out.println("      _  <<  \\    ");
                System.out.println("     `.\\__/`/\\\\    ");
                System.out.println("-=     '--'\\\\ `    ");
                System.out.println("     -=    //     ");
                System.out.println("           \\)");
                return;
            }
        } while( badGuy >0);
            System.out.println("You killed him");
        }
    

    
    
}





















//        Scanner scanner = new Scanner(System.in);
//        System.out.print(" guess the number: ");
//        int numberGuessed = scanner.nextInt();
//        Random rand = new Random();
//        int randomInt = rand.nextInt(100);
//            System.out.println("pseudo random int between 1 and 100 : " + randomInt);
//            if (numberGuessed > randomInt) {
//                System.out.println("LOWER");
//                return;
//            }else if (numberGuessed < randomInt){
//                System.out.println("Higher");
//                return;
//            }else{
//                System.out.println("GOOD GUESS");
//                return;
//            }