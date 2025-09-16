import java.util.Scanner;

class StrongNum {
    // Method to calculate factorial
    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit, sum = 0, copya = num;

        while (num != 0) {
            digit = num % 10;
            sum = sum + factorial(digit); // call factorial method
            num = num / 10;
        }

        if (sum == copya) {
            System.out.println("strong num");
        } else {
            System.out.println("not strong num");
        }
    }
}
