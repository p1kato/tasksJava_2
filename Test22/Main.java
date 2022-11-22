package Test22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean c = true;
        int k = 0;
        double a = 0;
        double sum = 0;

        while(c){
            double x = in.nextInt();

            if(x == 0){
                c = false;
                k -= 1;
            }
            k++;
            sum += x;

        }
        a = sum/k;
        System.out.println(a);

    }
}


