package chap01.quiz;


//정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드를 작성하세요
public class Q8 {
    static int sumof(int a , int b){
        int max;
        int min;

        if (a < b) {
			min = a;
            max = b;
		} else {
			min = b;
            max = a;
		}

        int sum = 0;
        for (int i = max; i <= min ; i++) {

            sum += i ;

        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumof(3,5));
    }

/*
     정답 코드
	static int sumof(int a, int b) {
		int min;		// a, b의 작은 쪽의 값
		int max;		// a, b의 큰 쪽의 값

		if (a < b) {
			min = a;  max = b;
		} else {
			min = b;  max = a;
		}

		int sum = 0;		// 총합
		for (int i = min; i <= max; i++)
			sum += i;
		return sum;
	}

 */

}
