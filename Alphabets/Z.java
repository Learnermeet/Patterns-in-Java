import java.util.Scanner;

public class Z {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print '*' for:
                // 1. Top horizontal line (i == 1)
                // 2. Bottom horizontal line (i == n)
                // 3. Diagonal from top-right to bottom-left (j == n - i + 1)
                if (i == 1 || i == n || j == n - i + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
