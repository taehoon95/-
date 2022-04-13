package 프로그래머스.레벨1;

import java.util.Arrays;

public class 평균구하기 {
    public double solution(int[] arr) {
		double sum = 0;
		double answer = 0;
		if(arr != null){
			for(int item : arr){
				sum += item;
			}
			answer = sum / arr.length;
		}
		
        return answer;
    }

    //  Array.stream() IntStream 라이브러리 느리긴하다.
    public double getMean(int[] array) {
        return (double) Arrays.stream(array).average().orElse(0);
    }
}
