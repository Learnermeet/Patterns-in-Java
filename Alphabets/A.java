import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int mid = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                if (j == n - i + 1 // left diagonal
                    || j == n + i - 1) { // right diagonal
                    System.out.print("*");
                }
                else if (i == mid // middle row
                     && j > n - i + 1 // after left diagonal
                     && j < n + i - 1) { // before right diagonal
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}