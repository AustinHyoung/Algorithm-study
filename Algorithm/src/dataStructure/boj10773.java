package dataStructure;

import java.util.Scanner;
import java.util.Stack;

public class boj10773 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        int K = sc.nextInt();
        
        for(int i=0; i<K; i++) {
        	int num = sc.nextInt();
            if(num == 0) {
                stack.pop();
            }else {
            	stack.push(num);
            }
            
            
        }
        if(stack.empty()) System.out.println(0);
        else {
            for(int i=0; i<stack.size(); i++){
                sum += stack.elementAt(i);
                
            }
            System.out.println(sum);
        }
	}

}
