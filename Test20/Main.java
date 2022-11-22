package Test20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean c = true;

        int count = 0;

        while(c){
            int x = in.nextInt();
            count++;

            if(x == 0){
                c = false;
                count -= 1;

            }
        }
        System.out.println(count);
    }
}
