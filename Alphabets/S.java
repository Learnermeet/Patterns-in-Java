import java.util.Scanner;

public class S {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print '*' for:
                // 1. Top horizontal line (i == 1)
                // 2. Middle horizontal line (i == mid)
                // 3. Bottom horizontal line (i == n)
                // 4. Left vertical line in upper half (j == 1 && i < mid)
                // 5. Right vertical line in lower half (j == n && i > mid)
                if (i == 1 || i == mid || i == n ||
                    (j == 1 && i < mid) ||
                    (j == n && i > mid)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
