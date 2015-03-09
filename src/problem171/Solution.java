//Excel Sheet Column Number 
package problem171;

public class Solution {
	public int titleToNumber(String s) {
		char[] charArray = s.toCharArray();
		int length = charArray.length;
		int ret = 0;
		for (int i = 0; i < length; i++) {
			ret += (charArray[i] - 'A' + 1) * Math.pow(26, length - i - 1);
		}
		return ret;
	}
}
