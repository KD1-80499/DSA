package com.sunbeam;

public class BSTree {
	public class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}
	}

	private Node root;

	public BSTree() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(int value) {
		Node newnode = new Node(value);

		if (isEmpty())
			root = newnode;
		else {
			Node trav = root;

			while (true) {
				if (value < trav.data) {
					if (trav.left == null) {
						trav.left = newnode;
						break;
					} else {
						trav = trav.left;
					}

				} else {
					if (trav.right == null) {
						trav.right = newnode;
						break;
					} else {
						trav = trav.right;
					}
				}

			}

		}

	}
	
	public void preOrder(Node trav)
	{
		if(trav==null)
			return;
		
		else {
		System.out.print(" "+trav.data);
		
		preOrder(trav.left);
		
		preOrder(trav.right);
		}
	}
	
	void preOrder()
	{
		System.out.println("PreOrder:");
		preOrder(root);
		System.out.print("");
	}

}
