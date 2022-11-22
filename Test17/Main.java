package Test17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int sum = 0;
        int k = 1;
        for(int i = 1; i <= n; i++) {

            sum = sum + k;
            k = k + 2;
        }
        System.out.println(sum);
    }
}