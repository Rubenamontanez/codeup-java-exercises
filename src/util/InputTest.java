package util;



public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        input.getString();
        input.getInt(1,10);
        input.getDouble(1,9);
        input.yesNo();
    }
}