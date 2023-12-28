package chap01.example;

import java.util.Scanner;

public class PrintStars1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,w;
        System.out.println("*를 n개 출력하되 w개마다 줄 바꿈");

        do {
            System.out.print("n값: ");
            n = scan.nextInt();
        }while (n<= 0);

        do {
            System.out.print("w값: ");
            w = scan.nextInt();
        }while (w<=0||w>n);

        for (int i = 0; i<n; i++){
            System.out.print('*');
            if (i%w== w-1){
                System.out.println();
            }

        }
        if (n%w !=0){
            System.out.println();
        }

    }
}
