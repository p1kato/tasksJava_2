package Test21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean c = true;

        int sum = 0;
        while(c){
            int x = in.nextInt();

            if(x == 0){
                c = false;
            }
            sum += x;
        }
        System.out.println(sum);
    }
}

