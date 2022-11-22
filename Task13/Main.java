package Task13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= m; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
