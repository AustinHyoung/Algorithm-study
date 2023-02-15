package dataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class boj10828 {
	
	public static List<Integer> list;
	
	public static void push(int el) {
		list.add(el);
	}
	
	public static int top() {
		if(list.isEmpty()) return -1;
		return list.get(list.size() - 1);
	}
	
	public static int size() {
		return list.size();
	}
	
	public static int empty() {
		return list.isEmpty() ? 1 : 0;
	}
	
	public static int pop() {
		if(list.isEmpty()) return -1;
		
		int el = (int)list.get(list.size() - 1);
		list.remove(list.size() - 1);
		
		return el;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        
        list = new ArrayList<>();
        
        for(int i=0; i<N; i++) {
        	String func = sc.next();
        	
        	switch (func) {
				case "push": {
					push(sc.nextInt());
					break;
				}
				case "top": {
					sb.append(top()).append('\n');
					break;
				}
				case "size": {
					sb.append(size()).append('\n');
					break;
				}
				case "empty": {
					sb.append(empty()).append('\n');
					break;
					
				}
				case "pop": {
					sb.append(pop()).append('\n');
					break;
				}
				default:
					sb.append("No function");
				}
        	}
        	System.out.println(sb);
	}

}
