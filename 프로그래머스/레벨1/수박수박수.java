package 프로그래머스.레벨1;

public class 수박수박수 {
    public String solution(int n) {
        char[] sCharArray = {'수', '박'};
        String answer = "";

        for(int i = 0; i < n; i++){
            answer += i % 2 == 0 ? sCharArray[0] : sCharArray[1];
        }
        return answer;
    }
}
