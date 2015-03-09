//Excel Sheet Column Title 
package problem168;

public class Solution {
	public String convertToTitle(int n) {
		StringBuilder stringBuilder = new StringBuilder();
		int i = 1;
		while (true) {
			int x = (int) Math.pow(26, i - 1);
			int a = n % x;
			if (a != 0) {
				stringBuilder.append((char) (a - 1 + 'A'));
			}
			n = n - a * x;
			i++;
		}
		return stringBuilder.reverse().toString();
	}
}
