package chap01.example;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        int n = scan.nextInt();

        int sum = 0;
        int i = 1;

        while (i<=n){
            sum += i;
            i++;
            // i 값이 n+1인지 확인하기
            if (i > n){
                System.out.println(i);
            }
        }
        System.out.println("1부터 "+n+"까지의 핪은 "+sum);


    }
}
