package InterviewCoding.codes;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of terms
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
    }
}

//output: Fibonacci Series: 0 1 1 2 3 5 8 13 21 34

