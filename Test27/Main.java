package Test27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float a = in.nextInt();
        double sum = 0;

        for(double i = 1; i <= a; i ++){
            sum += (1/i);
        }
        System.out.println(sum);
    }
}

