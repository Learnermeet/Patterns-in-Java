import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (
                    i == 1 ||                          // top
                    i == n ||                          // bottom
                    j == 1 ||                          // left side
                    (i >= (n + 1) / 2 && j == n) ||    // right side (lower half)
                    (i == (n + 1) / 2 && j >= (n + 1) / 2) // middle bar
                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}