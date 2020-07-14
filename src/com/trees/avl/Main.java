/**
 * 
 */
package com.trees.avl;

/**
 * 
 * Create an AVL Tree that reballances
 * 
 * @author marklapointe
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node root = new Node();
		
		root = root.insert(root, 100);
		root = root.insert(root, 0);
		root = root.insert(root, 200);
		root = root.insert(root, 10);
		root = root.insert(root, 150);
		root = root.insert(root, 15);
		root = root.insert(root, 130);
		root = root.insert(root, 1);
		root = root.insert(root, 2);
		root = root.insert(root, 3);
		
		System.out.println(root.getHeight());
		for (Node n: root.getInOrder()) {
			System.out.println(n.data + " " + n.height + " " + n.balance);
		}
	}

}
