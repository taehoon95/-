package 프로그래머스.레벨1;

public class 이상한문자만들기 {

    public String solution(String s) {
        String[] answer = s.split("");
        int index = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i].equals(" ")) {
                index = 0;
                answer[i] = " ";
            }
            else {
                answer[i] = index % 2 == 0 ? answer[i].toUpperCase() : answer[i].toLowerCase();
                index++;
            }
        }

        return String.join("", answer);
    }

    public String solution2(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");

        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
        }
        return answer;
    }


}
