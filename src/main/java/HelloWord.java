/**
 * Simple class to get you started.
 */
public class HelloWord {
    /**
     * Function the always returns the number 5.
     */
    public int returnsOnlyFive() {
        return 5;
    }

    public static void main(String[] args) {
        var app = new HelloWord();
        System.out.println("What does it return? " + app.returnsOnlyFive());
    }
}
