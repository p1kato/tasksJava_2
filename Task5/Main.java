package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        int x = in.nextInt();

        for (int i = y; i <= x; i++) {
            System.out.print(i+" ");
        }

    }
}
