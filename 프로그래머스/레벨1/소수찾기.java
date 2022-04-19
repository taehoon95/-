package 프로그래머스.레벨1;

import java.util.Arrays;

public class 소수찾기 {
    public int solution(int n) {
        int answer = 0;

        boolean[] filter = new boolean[n+1];
        Arrays.fill(filter, true);
        filter[0] = false;
        filter[1] = false;

        for(int i = 2; i * i < n; i++){
            if(filter[i] == true){
                for(int j = i*i; j <= n; j += i){
                    filter[j] = false;
                }
            }
        }

        for(int i = 2; i < Math.sqrt(n); i++){
            if(filter[i] == true){
                for(int j = 2*i; j <= n; j += i){

                }
            }
        }

        for(int i = 0; i <= n; i++){
            if(filter[i])
                answer += 1;
        }

        return answer;
    }
}
