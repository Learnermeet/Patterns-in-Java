import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print '*' for:
                // 1. Left vertical line (j == 1)
                // 2. Right vertical line (j == n)
                // 3. Main diagonal from top-left to bottom-right (j == i)
                if (j == 1 || j == n || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}