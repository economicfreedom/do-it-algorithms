package chap01.quiz;

public class Q4 {

    // 세 값의 대소 관계 13가지 조합 구하기
    public static int getMedian(int a, int b, int c) {

        if (a >= b) {
            if (b >= c) {
                return b;
            } else if (a <= c) {
                return a;
            } else {
                return c;
            }

        } else if (a > c) {
            return a;
        } else if (b > c) {
            return c;
        } else {
            return b;


        }


    }
    	public static void main(String[] args) {
		System.out.println("med3(3,2,1) = " + getMedian(3,2,1));      // a＞b＞c
		System.out.println("med3(3,2,2) = " + getMedian(3,2,2));      // a＞b＝c
		System.out.println("med3(3,1,2) = " + getMedian(3,1,2));      // a＞c＞b
		System.out.println("med3(3,2,3) = " + getMedian(3,2,3));      // a＝c＞b
		System.out.println("med3(2,1,3) = " + getMedian(2,1,3));      // c＞a＞b
		System.out.println("med3(3,3,2) = " + getMedian(3,3,2));      // a＝b＞c
		System.out.println("med3(3,3,3) = " + getMedian(3,3,3));      // a＝b＝c
		System.out.println("med3(2,2,3) = " + getMedian(2,2,3));      // c＞a＝b
		System.out.println("med3(2,3,1) = " + getMedian(2,3,1));      // b＞a＞c
		System.out.println("med3(2,3,2) = " + getMedian(2,3,2));      // b＞a＝c
		System.out.println("med3(1,3,2) = " + getMedian(1,3,2));      // b＞c＞a
		System.out.println("med3(2,3,3) = " + getMedian(2,3,3));      // b＝c＞a
		System.out.println("med3(1,2,3) = " + getMedian(1,2,3));      // c＞b＞a
	}


}
