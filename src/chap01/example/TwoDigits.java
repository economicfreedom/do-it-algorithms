package chap01.example;

import java.util.Scanner;

public class TwoDigits {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int no;

        do {
            System.out.println("no값: ");
            no = scan.nextInt();

        }while (no<10||no>99);

        System.out.println("변수 no값은 "+no+"이 되었습니다");
    }
    
    

}
