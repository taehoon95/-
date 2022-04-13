package 프로그래머스.레벨1;
public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
		int[] answer = new int[2];	

		if(m % n == 0){
			answer[0] = n;
			answer[1] = m;
		}else {
			for(int i = 1; i <= m; i ++){
				if(n%i == 0 && m%i == 0){
					answer[0] = i;
				}
			}
			answer[1] = n*m/answer[0];
		}

        return answer;
    }

    // 재귀함수 이용
    public int[] gcdlcm(int a, int b) {
		int[] answer = new int[2];

		answer[0] = gcd(a,b);
		answer[1] = (a*b)/answer[0];
		
		return answer;
	}

    public static int gcd(int p, int q){
    if (q == 0) return p;
    return gcd(q, p%q);
    }
}
