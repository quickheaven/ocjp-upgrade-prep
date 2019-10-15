package ca.quickheaven.ocjp.practice.test.two;

public class Question47 {

    public static void main(String[] args) {
        String comparing = "";
        final String compared = "text";

        switch (comparing) {
            case compared:
                System.out.println("These texts are equal");
                break;
            default:
                System.out.print("These texts are not equal");
                break;
        }
        // Which change can be made to the above code to make it compiled?
        // >> Make both variables comparing and compared final by prepending the final keyword.
    }
}
