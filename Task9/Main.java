package Task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        if(n % 2 == 0){
            n = n + 1;
        }
        for (int i = n; i <= m; i += 2) {
            System.out.print(i+" ");
        }

    }
}