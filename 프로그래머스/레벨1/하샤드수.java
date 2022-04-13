package 프로그래머스.레벨1;

public class 하샤드수 {

    // 수행시간 오래걸림 5ms
    public boolean solution(int x) {
		String xToString = x + "";
		int sum = 0;
		int xDivisionTen = x;
		for(int i = 0; i < xToString.length() ; i ++){
			int xModTen = xDivisionTen % 10;
			xDivisionTen = xDivisionTen / 10;
			sum  += xModTen;
		}
		
		boolean answer = x % sum == 0;
        return answer;
    }

    // 1ms
    public boolean solution2(int x) {
        int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
        return x % sum == 0;
    }

    // 수행시간이 짧음 0.1ms
    public boolean solution3(int num){

        String[] temp = String.valueOf(num).split("");
    
        int sum = 0;
        for (String s : temp) {
            sum += Integer.parseInt(s);
        }
    
        if (num % sum == 0) {
                return true;
        } else {
          return false;
        }
    }
}
