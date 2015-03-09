//ZigZag Conversion 
package problem6;

public class Solution {
	public String convert(String s, int nRows) {
		char[] charArray = s.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		if (nRows == 1) {
			return s;
		} else if (nRows == 2) {
			sideLine(charArray, 1, nRows, stringBuilder);
			sideLine(charArray, 2, nRows, stringBuilder);
		} else {
			sideLine(charArray, 1, nRows, stringBuilder);
			for (int i = 2; i < nRows; i++) {
				midLine(charArray, i, nRows, stringBuilder);
			}
			sideLine(charArray, nRows, nRows, stringBuilder);
		}
		return stringBuilder.toString();
	}

	public void sideLine(char[] charArray, int n, int nRows,
			StringBuilder stringBuilder) {
		int step = 2 * (nRows - 1);
		int index = n - 1;
		while (index < charArray.length) {
			stringBuilder.append(charArray[index]);
			index += step;
		}
	}

	public void midLine(char[] charArray, int n, int nRows,
			StringBuilder stringBuilder) {
		int step1 = 2 * (nRows - 1);
		int step2 = 2 * (nRows - n);
		int index = n - 1;
		while (index < charArray.length) {
			stringBuilder.append(charArray[index]);
			if (index + step2 < charArray.length) {
				stringBuilder.append(charArray[index + step2]);

			}
			index += step1;
		}
	}
}
