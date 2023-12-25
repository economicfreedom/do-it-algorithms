package chap01.example;

import java.util.Scanner;

// 조건 판단과 분기

/*
    정숫값의 부호 양수/음수/0를 판단하는 프로그램
 */

public class JudgeSign {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요");

        int n = scan.nextInt();

        if (n>0){
            System.out.println("양수");
        }else if (n < 0){
            System.out.println("음수");
        }else {
            System.out.println("0");
        }



    }
}
