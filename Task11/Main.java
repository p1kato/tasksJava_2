package Task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();

        for (int i = 1; i <= m; i++) {
            if(m % i == 0){
                System.out.print(i+" ");
            }
        }

    }
}
