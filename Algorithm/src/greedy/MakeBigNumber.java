package greedy;


//큰 수 만들기
public class MakeBigNumber {

	public String solution(String number, int k) {
		int size = number.length() - k;
		StringBuffer answer = new StringBuffer();
		
		char max ;
		int index = 0; //이번 회차에서 가장 큰 수 이후의 index부터 탐색해야 하기 때문
		
		for(int i = 0 ; i < size ; i++) {			
			max = '0';
			
			for(int j = index ; j <= k + i ; j++) {
				if(max < number.charAt(j)) {
					max = number.charAt(j);
					index = j+1;
				}
			}
			answer.append(max);
		}
				
		return answer.toString();
	}
	
	public static void main(String[] args) {
		MakeBigNumber big = new MakeBigNumber();
		
		System.out.println(big.solution("1231234", 3));
	}

}
 