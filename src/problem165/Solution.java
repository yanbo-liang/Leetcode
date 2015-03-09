//Compare Version Numbers
package problem165;

public class Solution {
	public int compareVersion(String version1, String version2) {
		String[] a = version1.split("\\.");
		String[] b = version2.split("\\.");
		int longest = 0;
		if (a.length > b.length) {
			longest = a.length;
		} else {
			longest = b.length;
		}
		for (int i = 0; i < longest; i++) {
			int subversion1 = 0;
			int subversion2 = 0;
			if (i < a.length) {
				subversion1 = Integer.parseInt(a[i]);
			}
			if (i < b.length) {
				subversion2 = Integer.parseInt(b[i]);
			}
			if (subversion1 > subversion2) {
				return 1;
			}
			if (subversion1 < subversion2) {
				return -1;
			}
		}
		return 0;
	}
}
