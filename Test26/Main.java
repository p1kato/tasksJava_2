package Test26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;

        while (true) {
            int k = in.nextInt();

            if(k%2!=0) {
                sum = sum + k;
            }
            if (k==0)
                break;
        }
        System.out.print(sum);
    }
}

