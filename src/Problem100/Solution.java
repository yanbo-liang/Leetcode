//Same Tree
package Problem100;

public class Solution {
	// Definition for binary tree
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		} else if (p == null || q == null) {
			return false;
		}
		if (p.val != q.val) {
			return false;
		}
		if (isSameTree(p.left, q.left) == false
				|| isSameTree(p.right, q.right) == false) {
			return false;
		}
		return true;
	}
}
