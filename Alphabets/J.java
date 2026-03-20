import java.util.Scanner;
public class J {
    public static void main(String[] args) {
        System.out.print("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 ||                             // top line
                    j == (n + 1) / 2 ||                   // vertical line
                    (i == n && j <= (n + 1) / 2) ||       // bottom curve
                    (j == 1 && i >= (n + 1) / 2)) {        // left bottom
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}