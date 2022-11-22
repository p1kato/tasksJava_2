package Test23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = -9999;
        while (true) {
            int x = in.nextInt();

            if(x > max) {
                max = x;
            }
            if(x == 0){
                break;
            }
        }
        System.out.println(max);
    }
}

