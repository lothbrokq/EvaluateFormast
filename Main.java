public class Main {

    // A constant in this Java program
    public static final int CONSTANT = 20;
    
    public static void main(String[] args) {
        // Calling the first method
        int resultOneChanged = multiplyByConstant(5);
        int resultTwo = multiplyByConstant(7);
        System.out.println("The result  is " + resultOneChanged);

        if (resultTwo != resultOneChanged){
            System.out.println("The results are not equal")
        }

        // Calling the second method
        if (resultTwo > resultOneChanged){
            printGreeting("John");
        } else if (resultTwo < resultOneChanged) {
            printGreeting("Matt");
        } else {
            printGreeting("Boss");
        }
    }

    // Another simple method that prints a greeting
    public static void printGreeting(String name) {
        System.out.println("Hello, " + name + "! Welcome to the program.");
    }

    // A simple method that multiplies an integer by a constant
    public static int multiplyByConstant(int number) {
        return number * CONSTANT;
    }

}
