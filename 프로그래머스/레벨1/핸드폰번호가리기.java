package 프로그래머스.레벨1;

public class 핸드폰번호가리기 {
    public String solution(String phone_number) {
		int phone_number_length= phone_number.length();
		
        // 마지막 번호 4개 추출
		String phone_number_last_four = new String(phone_number.substring(phone_number_length-4, phone_number_length));

		StringBuilder answer = new StringBuilder();
		for(int i=0; i < phone_number_length-4; i++){
			answer.append("*");
		}

		answer.append(phone_number_last_four);

        return answer.toString();
    }

    // 2. 정규식으로 풀이
    // . : 임의의 문자 한개 
    // (?=.) : 뒷쪽에 임의의 문자 한개를 제외하고 선택
    // {숫자} : 숫자 만큼의 자릿수
    // .(?=.{4}) ==> 뒤쪽에서 임의의 문자 4개를 제외한 임의의 문자 한 개 선택
    public String solution2(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }

    // 3. 코드가 간단해 보여서 참고
    public String solution3(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
     }
}
