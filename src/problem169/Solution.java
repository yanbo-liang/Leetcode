//Majority Element 
package problem169;

public class Solution {
	public int majorityElement(int[] num) {
		int tmp = 0;
		int counter = 0;
		for (int i = 0; i < num.length; i++) {
			if (counter == 0) {
				tmp = num[i];
				counter = 1;
			} else if (num[i] == tmp) {
				counter++;
			} else {
				counter--;
			}
		}
		return tmp;
	}
}
