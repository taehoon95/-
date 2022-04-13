package 프로그래머스.레벨1;

import java.util.Arrays;

public class 가장작은수제거하기 {

    // for문 이용 : 확실히 빠름
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[arr.length-1];
        int minIndex=0;

        for(int i=0;i<arr.length;i++){
            if(arr[minIndex]>arr[i]){
                minIndex = i;
            }
        }

        //  arr에서 minIndex위치의 값을 바로 뒤의 값으로 바꿔 준다.(결국 minIndex 마지막 위치라면 for문 돌지 않는다.)
        for(int i=minIndex+1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        for(int i=0;i<answer.length;i++){
            answer[i] = arr[i];
        }
        return answer;
    }

    // 스트림 : 코드가 짧긴 한데 for문 보다 꾀 느리다.
    public int[] solution2(int[] arr) {
        if (arr.length <= 1) return new int[]{ -1 };
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
