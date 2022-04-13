package 프로그래머스.레벨1;

public class 콜라츠추측 {
    public int solution(long num) {
        int answer = 0;
		
		while(answer == 500 || num != 1){
			num = num % 2 == 0 ? num /= 2 : num * 3 + 1;
			answer++;
		}
		
		return answer >= 500 ? answer = -1 : answer;
    }
}
