//Valid Parentheses
package problem20;

import java.util.Stack;

public class Solution {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char a = charArray[i];
			if (a == '(' || a == '[' || a == '{') {
				stack.push(new Character(a));
			} else if (a == ')' || a == ']' || a == '}') {
				if (stack.isEmpty()) {
					return false;
				} else {
					char b = stack.peek().charValue();
					if (b == '(' && a == ')') {
						stack.pop();
					} else if (b == '[' && a == ']') {
						stack.pop();
					} else if (b == '{' && a == '}') {
						stack.pop();
					} else {
						return false;
					}
				}
			}
		}
		if (!stack.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}
}