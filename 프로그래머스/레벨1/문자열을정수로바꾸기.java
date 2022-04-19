package 프로그래머스.레벨1;

public class 문자열을정수로바꾸기 {
    public int solution(String s) {
        boolean sign = true;
        int answer = 0;

        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);

            if(sChar == '-'){
                sign = false;
            }else if(sChar != '+'){
                answer = answer * 10 + (sChar - '0');
            }
        }

        answer = sign ? answer : -1 * answer;
        return answer;
    }
}
