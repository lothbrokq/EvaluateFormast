public class Main {

    // A constant in Java
    public static final int CONSTANT = 10;
    
    public static void main(String[] args) {
        // Calling the first method
        int resultOne = multiplyByConstant(5);
        int resultTwo = multiplyByConstant(7);
        System.out.println("The result is " + resultOne);

        // Calling the second method
        if (resultTwo > resultOne){
          printGreeting("John");
        } else if (resultTwo < resultOne) {
          printGreeting("Matt");
        } else {
          printGreeting("Boss");
        }
    }

    // A simple method that multiplies an integer by a constant
    public static int multiplyByConstant(int number) {
        return number * CONSTANT;
    }

    // Another simple method that prints a greeting
    public static void printGreeting(String name) {
        System.out.println("Hello, " + name + "! Welcome to the program.");
    }
}
