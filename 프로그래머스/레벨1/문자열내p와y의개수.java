package 프로그래머스.레벨1;

public class 문자열내p와y의개수 {
    boolean solution(String s) {
        char[] sCharArray = s.toCharArray();
        int pSum = 0;
        int ySum = 0;
        for(char item : sCharArray){
            pSum = item == 'p' || item == 'P' ? pSum +  1 : pSum;
            ySum = item == 'y' || item == 'Y' ? ySum +  1 : ySum;
        }
        boolean answer = pSum == ySum ? true : false;

        return answer;
    }

    boolean solution2(String s) {
        s = s.toUpperCase();
        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }

    boolean solution3(String s) {
        char[] sCharArray = s.toLowerCase().toCharArray();
        int count = 0;
        for(char item : sCharArray){
            if(item == 'p'){
                count++;
            }else if(item == 'y'){
                count--;
            }
        }
        boolean answer = count == 0 ? true : false;

        return answer;
    }
}
