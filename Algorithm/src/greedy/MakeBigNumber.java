package greedy;


//ū �� �����
public class MakeBigNumber {

	public String solution(String number, int k) {
		int size = number.length() - k;
		StringBuffer answer = new StringBuffer();
		
		char max ;
		int index = 0; //�̹� ȸ������ ���� ū �� ������ index���� Ž���ؾ� �ϱ� ����
		
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
 