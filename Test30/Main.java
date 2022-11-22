package Test30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k, n, w, sum = 0;
        k = in.nextInt();
        n = in.nextInt();
        w = in.nextInt();

        for(int i = 1; i <= w; ++i){
            sum+=i * k;
        }
        if(sum > n){
            System.out.println(sum - n);
        }else{
            System.out.println(0);
        }
    }
}
