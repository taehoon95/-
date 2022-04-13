package 프로그래머스.레벨1;

public class 직사각형별찍기 {
    public void solution(int a, int b){
		for(int i = 0; i < b; i++){
			for(int j = 0; j < a; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

    // 다른 사람 풀이 (stringbuilder 이용)
    public void solution2(int a, int b){
		StringBuilder sb = new StringBuilder();

        for(int i=0; i<a; i++){
            sb.append("*"); 
        }
        for(int i=0; i<b; i++){
            System.out.println(sb.toString());
        }
	}
}
