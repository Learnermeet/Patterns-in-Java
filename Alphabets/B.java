import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int mid = (n / 2) + 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (j == 1 ||                 // left vertical
                    i == 1 ||                 // top
                    i == mid ||               // middle
                    i == n ||                 // bottom
                    (j == n && i != 1 && i != mid && i != n)) {  // right vertical
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