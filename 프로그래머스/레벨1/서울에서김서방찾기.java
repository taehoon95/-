package 프로그래머스.레벨1;

import java.util.Arrays;

public class 서울에서김서방찾기 {
    public String solution(String[] seoul) {
        int index = Arrays.asList(seoul).indexOf("Kim");
        String answer = "김서방은 "+index+"에 있다.";
        return answer;
    }

    public boolean solution(String s) {
        boolean answer = true;
        return answer;
    }
}
