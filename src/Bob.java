import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Talk to Bob:");
        String name = scanner.nextLine(); // Get what the user types.
        if (name.endsWith("?")){
            name = name.replaceAll("\\s", "");
            System.out.println("Sure");
        }else if (name.endsWith("!")){
            name = name.replaceAll("\\s", "");
            System.out.println("Whoa, chill out!");
        }else if(name.equals("")){
            System.out.println("Fine. Be that way!");
        }else{
            System.out.println("Whatever");
        }
    }
}
