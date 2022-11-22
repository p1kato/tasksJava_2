package Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        for (int i = 0; i <= x; i = i + 2) {
            System.out.print(i+" ");
        }

    }
}
