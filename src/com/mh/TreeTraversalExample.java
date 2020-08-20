package com.mh;

public class TreeTraversalExample {

	class TreeNode {
		int value;
		TreeNode left;
		TreeNode right;

		TreeNode(int value, TreeNode left, TreeNode right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
	}

	TreeNode buildTree() {
		TreeNode root = new TreeNode(1, 
								new TreeNode(2, 
										new TreeNode(4, null, null), 
										new TreeNode(5, null, null)),
								new TreeNode(3, 
										new TreeNode(6, null, null), 
										new TreeNode(7, null, null))
								);
		return root;
	}

	void visitTreePreOrder(TreeNode root) {
		if (root != null) {
			System.out.printf("%d ", root.value);
			visitTreePreOrder(root.left);
			visitTreePreOrder(root.right);
		}
	}

	void visitTreePostOrder(TreeNode root) {
		if (root != null) {
			visitTreePostOrder(root.left);
			visitTreePostOrder(root.right);
			System.out.printf("%d ", root.value);
		}
	}

	void visitTreeInOrder(TreeNode root) {
		if (root != null) {
			visitTreeInOrder(root.left);
			System.out.printf("%d ", root.value);
			visitTreeInOrder(root.right);
		}
	}

	public TreeTraversalExample() {
		TreeNode root = buildTree();
		System.out.print("\nPre-order: ");
		visitTreePreOrder(root);

		System.out.print("\nPost-order: ");
		visitTreePostOrder(root);

		System.out.print("\nIn-order: ");
		visitTreeInOrder(root);
	}

	public static void main(String[] args) {
		new TreeTraversalExample();
	}
}
