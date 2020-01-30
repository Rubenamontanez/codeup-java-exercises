public class StringExercise {
    public static void main(String[] args) {
        String pink = "We don't need no education, ";
            pink  += "\nWe don't need no thought control";
        System.out.println(pink);

        System.out.print("\n");
        String check = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(check);
        System.out.print("\n");
        String windows = "In windows, the main drive is usually C:\\";
        System.out.println(windows);
        System.out.print("\n");
        String back = "I can do backslashes \\, double backslashes \\\\,";
            back = back + "\nand the amazing triple backslash \\\\\\!";
          System.out.println(back);
//        String s= "C:\\Program Files\\Text.text";
//        System.out.println(s.replace("\\", "\\\\"));



        String demo = new String("Return the length of a string");
        System.out.println();

        System.out.printf("demo.charAt(6):\t%c\n\n", demo.charAt(6));

    }
}
