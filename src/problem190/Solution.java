//Reverse Bits
package problem190;

public class Solution {
	// you need treat n as an unsigned value
	public int reverseBits(int n) {
		for (int i = 0; i < Integer.SIZE / 2; i++) {
			int j = Integer.SIZE - 1 - i;
			int low = (n >> i) & 1;
			int high = (n >> j) & 1;
			if ((low ^ high) == 1) {
				n = n ^ ((1 << i) | (1 << j));
			}
		}
		return n;
	}
}
