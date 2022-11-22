package Task3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String y = in.next();

        int x = in.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.println(y);
        }

    }
}