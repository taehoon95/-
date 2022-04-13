package 프로그래머스.레벨1;

public class 행렬의덧셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int answerRow = arr1.length;
        int answercolumn = arr1[0].length;

        int[][] answer = new int[answerRow][answercolumn]; // int[][] answer = arr1; 으로 할당 해도 된다.(어차피 같은 크기이기 때문)

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                int paramSum = arr1[i][j] + arr2[i][j];	
                answer[i][j] = paramSum;
            }
        }

        return answer;
    }
}
