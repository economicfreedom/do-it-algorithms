package chap01.quiz;

public class MinMaxQuiz {


    // 네 값의 쵀디값을 구하는 메소드 작성
    static int max4(int a, int b, int c, int d){
        int max = a;
        if (b > max ) max = b;
        if (c > max ) max = c;
        if (d > max ) max = d;

        return max;
    }

    // 세 값의 최소값을 구하는 메소드 작성
    static int min3(int a, int b, int c){
        int min = a;
        if (b < min )min = b;
        if (c < min ) min = c;


        return min;
    }

    // 네 값의 최솟값을 구하는 min4 메서드를 작성
    static int min4(int a, int b, int c,int d){
        int min = a;
        if (b < min )min = b;
        if (c < min ) min = c;
        if (d < min ) min = d;


        return min;
    }
}
