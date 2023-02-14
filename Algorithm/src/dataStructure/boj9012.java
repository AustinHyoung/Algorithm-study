package dataStructure;

import java.util.Scanner;
import java.util.Stack;

public class boj9012 {
	
	public static String solution(String str) {
		Stack<Character> stack = new Stack<>();
	            
        for(int i=0; i<str.length(); i++) {
        	char ch = str.charAt(i);
        	
        	if(ch == '(') {
        		stack.push(ch);
        	} else if (stack.empty()) {
        		return "NO";
        	} else {
        		stack.pop();
        	}
        }
        
        if(stack.empty()) {
        	return "YES";
        } else {
        	return "NO";
        }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for(int i=0; i<T; i++) {
        	System.out.println(solution(sc.next()));
        }
	}
}
