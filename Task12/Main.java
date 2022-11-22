package Task12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();

        for (int i = 1; i <= m; i++) {
            System.out.println(i+" "+((int)Math.pow(i,2)));

        }

    }
}