public class printf {
    public static void main(String[] args) {

        //System.out.printf("This is a string: %d", 123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Dan";
        int myInt = 50;
        double myDouble = 1000;

        //System.out.printf("Hello, this is %b.", myBoolean);
        //System.out.printf("My mail contains %c.", myChar);
        //System.out.printf("My name is %s.", myString);
        //System.out.printf("I have %d dollars.", myInt);
        System.out.printf("I have %.2f dollars.", myDouble);
    }
}

