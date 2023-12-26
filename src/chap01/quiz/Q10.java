package chap01.quiz;
// 양의 정수를 입력하고 자릿수를 출력하는 프로그램 작성 

import java.util.Scanner;

// ex 135를 입력하면 3자리수 1234를 입력하면 4자리수
public class Q10 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n;
        do {
            System.out.print("정수 :");
            n = scan.nextInt();
        }while (n<=0);

        int num = 0;
        // n 를 10으로 나누면서 num을 1씩 증가시킴
        // 100 / 10 = 10
        // num = 1
        // 10/10 = 1
        // num = 2
        // 1 / 10
        // num = 3
        while (n > 0){
            n /= 10;
            num ++;
        }

        System.out.println(num+"자리수");


    }
}

