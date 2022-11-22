package Test25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double s = 1;

        while (true) {
            double x = in.nextDouble();

            if (x == 0)
                break;
            s = s * x;

        }
        System.out.print(s);
    }
}

