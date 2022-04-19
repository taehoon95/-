import 프로그래머스.레벨1.시저암호;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;

public class test{
	public static void main(String[] args) {
		test a = new test();
		int[] arr = {2,3,0,1};

		String rs = "Pys";
		int n = 1;
		int v = 4;
		String[] rsArray = {"Jane","Kim"};
		System.out.println(a.solution(n, v)); //10
	}

	public long solution(int a, int b) {
		long miniSum = sumOfSequences(Math.min(a,b) - 1);
		long sum = sumOfSequences(Math.max(a,b));

		long answer = a == b ? a : sum - miniSum;
		return answer;
	}

	long sumOfSequences(int number){
		return number * (number + 1) / 2;
	}

}