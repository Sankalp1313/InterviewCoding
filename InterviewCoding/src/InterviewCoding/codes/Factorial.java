package InterviewCoding.codes;

public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Change this to calculate factorial of a different number
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial =factorial * i;  // or factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
