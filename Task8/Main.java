package Task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        int x = in.nextInt();

        if(y%2!=0){
            y = y + 1;
        }
        for (int i = y; i <= x; i += 2) {
            System.out.print(i+" ");
        }
    }
}