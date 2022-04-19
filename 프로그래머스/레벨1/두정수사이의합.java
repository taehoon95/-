package 프로그래머스.레벨1;

public class 두정수사이의합 {
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
