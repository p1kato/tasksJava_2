package Test19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        double cum = 0;
        int k = 0;

        for(int i = m; i <= n; i++) {
            cum = cum + i;
            k = k + 1;
        }
        System.out.println(cum / k);
    }
}