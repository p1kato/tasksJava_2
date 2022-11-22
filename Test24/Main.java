package Test24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int k = 1;
        int sum = 1;

        for(int i = 1; i <= m; i++){
            sum = sum * i; //1 2 3
        }
        System.out.println(sum);
    }

}
