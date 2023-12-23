package chap01.example;
// 3개의 정숫값을 엽락하고 최댓값을 구하여 출력

import java.util.Scanner;

public class Max3Method {
    public static void main(String[] args) {

        int max = max3(1,2,3);

    }

    public static int max3(int a, int b, int c) {

        int max = a;
        if (b > max) max = b;
        if (c > max ) max = c;
        return max;

    }

}
