package chap01.quiz;

import java.util.Scanner;

/*
    가우스의 덧셈
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값: ");
        int n = scan.nextInt();
        int i = 1;
        System.out.println((i + n) * n / 2);

    }
    //
                    //12    *   5 + 12 / 2 +6 = 66
                //(11  + 1) * (11 / 2) + (11%2 == 1 ? (11+1)/ 2:0
    //int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);   // 총합
    //
    //		System.out.println("1에서 " + n + "까지의 총합은 " + sum + "입니다.");
}
