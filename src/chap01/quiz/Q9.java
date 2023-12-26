package chap01.quiz;

import java.util.Scanner;

// 두 정수를 입력하고 b-a를 출력하는 프로그램 작성
public class Q9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        do {
            System.out.print("a값: ");
            a = scan.nextInt();
            System.out.print("b값: ");
            b = scan.nextInt();
            if (a > b)
                System.out.println("a보다 큰 값을 입력하세요");
        } while (a > b);

        System.out.println("b - a = "+(b-a));

    }
}
/*
정답
System.out.print("a의 값 : ");
		int a = stdIn.nextInt();

		int b;
		while (true) {
			System.out.print("b의 값 : ");
			b = stdIn.nextInt();
			if (b > a) break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}

		System.out.println("b - a는 " + (b - a) + "입니다.");
 */
