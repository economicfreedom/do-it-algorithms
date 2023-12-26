package chap01.example;

import java.util.Scanner;


// 1부터 n까지의 합과 그 값을 구하는 과정을 출력하도록 수정한 프로그램 최적화 1
public class SumVerbose2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구함");

        do {
            System.out.println("n의 값: ");
            n = scan.nextInt();
        } while (n <= 0);

        int sum = 0;
        for (int i = 1; i < n; i++) {
            System.out.print(i+" + ");
            sum += i;
        }

        System.out.print(n+" = ");
        sum += n;
        System.out.println(sum);
    }

}
