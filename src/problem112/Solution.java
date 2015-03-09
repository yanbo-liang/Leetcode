//Path Sum
package problem112;

import java.util.Stack;

public class Solution {
	// Definition for binary tree
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean hasPathSum(TreeNode root, int sum) {
		Stack<TreeNode> nodeStack = new Stack<TreeNode>();
		Stack<Integer> sumStack = new Stack<Integer>();
		nodeStack.push(root);
		sumStack.push(sum);
		while ((!nodeStack.isEmpty()) && (root != null)) {
			TreeNode node = nodeStack.pop();
			int val = sumStack.pop();
			if (node.left == null && node.right == null && node.val == val) {
				return true;
			}
			if (node.right != null) {
				nodeStack.push(node.right);
				sumStack.push(val - node.val);
			}
			if (node.left != null) {
				nodeStack.push(node.left);
				sumStack.push(val - node.val);
			}
		}
		return false;
	}
}