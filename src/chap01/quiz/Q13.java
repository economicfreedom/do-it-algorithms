package chap01.quiz;


import java.util.Scanner;

//별찍기
public class Q13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
                System.out.println("*".repeat(n));

        }
    }
}


