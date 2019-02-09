
public class MainClass {
    public static void main(String[] args) {
        if (args.length != 0 && args[0].equals("Hello")) {
            System.out.println("Hi");
        }
        else
        {
            System.out.println("Is any body there?!");
        }

        int number = 1;

        first();

        number = 2;

        second();

        number = 3;

        AnotherClass.SayAnotherClass();

        System.out.println("This is the end")
    }

    public static void first() {
        System.out.println("First");
    }

    public static void second() {
        System.out.println("Second");
    }
}
