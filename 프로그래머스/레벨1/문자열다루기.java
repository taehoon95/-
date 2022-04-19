package 프로그래머스.레벨1;

public class 문자열다루기 {
    // 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() < 4 || s.length() > 6 || s.length() == 5) return false;
        String[] sArray = s.split("");
        for(String item : sArray){
            try{
                int intS = Integer.parseInt(item) - 1;
            }catch (NumberFormatException e){
                answer = false;
            }
        }
        return answer;
    }

    public boolean solution2(String s) {
        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e){
                return false;
            }
        }
        else return false;
    }
}
