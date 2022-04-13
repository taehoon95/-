package 프로그래머스.레벨1;

public class X만큼간격이있는n개의숫자 {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];

		for(int i = 0; i < n; i++){
			answer[i] = (i+1) * x;
		}
        return answer;
    }
}
