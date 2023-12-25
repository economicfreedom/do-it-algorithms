package chap01.example;

import java.util.Scanner;

// 조건 판단과 분기


public class JudgeABC2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");

        int n = scan.nextInt();

        if (n==1){
            System.out.println("A");
        }else if(n==2) {

            System.out.println("B");
        }else if (n==3){
            System.out.println("c");
        }



    }
}
