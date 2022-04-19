package 프로그래머스.레벨1;

public class 시저암호 {
    public String solution(String s, int n) {
        //'A' : 65 , 'Z': 90,'a': 97, 'z': 122, ' ': 32
        char[] answer = s.toCharArray();
        int i = 0;
        for(char answerChar : answer){
            if(answerChar == ' '){
                answer[i] = answerChar;
            }else{
                if(Character.isUpperCase(answerChar)){
                    answer[i] = answerChar + n > 90 ? (char)(answerChar + n - 26) : (char)(answerChar + n);
                }else{
                    answer[i] = answerChar + n > 122 ? (char)(answerChar + n - 26) : (char)(answerChar + n);
                }
            }
            i++;
        }

        return String.valueOf(answer);
    }

    public String caesar(String s, int n) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(ch)) {
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }
            result += ch;
        }
        return result;
    }

    public String solution2(String s, int n){
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            if(Character.isUpperCase(sChar)){
                sChar = (char)((sChar + n - 'A') % 26 + 'A');
            }else if(Character.isLowerCase(sChar)){
                sChar = (char)((sChar + n - 'a') % 26 + 'a');
            }
            answer += sChar;
        }
        return answer;
    }

}
