import java.util.Scanner;

public class V {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (2 * n) - 1; j++) {
                // Print '*' for two diagonals moving inward
                // 1. Left-to-bottom diagonal (j == i)
                // 2. Right-to-bottom diagonal (j == 2*n - i)
                if (j == i || j == (2 * n - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
