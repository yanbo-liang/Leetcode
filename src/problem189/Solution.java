//Rotate Array 
package problem189;

public class Solution {
	public void rotate(int[] nums, int k) {
		int[] tmp = new int[nums.length * 2];
		for (int i = 0; i < nums.length; i++) {
			tmp[i] = nums[i];
			tmp[i + nums.length] = nums[i];
		}
		k = k % nums.length;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = tmp[i + nums.length - k];
		}
	}
}