package chap01.example;

//실습 1-12는 지정한 개수의 기호를 중간에 줄바꿈 없이 연속해서 보여주는 프로그램
// +,-기호를 번갈아가며 출력함

// p 37

import java.util.Scanner;

public class Alternative2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n;

        System.out.println("+와 -를 번갈아 n개 출력함");
        do {
            System.out.println("n의 값: ");
            n = scan.nextInt();
        } while (n <= 0);

        for (int i = 0; i < n / 2; i++) {
            System.out.print("+-");
        }
        if (n%2 != 0){
            System.out.print("+");
        }


    }
}
