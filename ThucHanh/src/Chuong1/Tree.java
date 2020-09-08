/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chuong1;

/**
 *
 * @author Admin
 */
public class Tree {

    private TreeNode root;

    public Tree() {
        root = null;
    }

    public void insertNode(int insertValue) {
        if (root == null) {
            root = new TreeNode(insertValue);
        } else {
            root.insert(insertValue);
        }
    }

    public void preorderTraversal() {
        preorder(root);
    }

    public void inorderTraversal() {
        inorder(root);
    }

    public void postorderTraversal() {
        postorder(root);
    }

    public boolean Search(int x) {
        return Search_(root,x);
    }

    private boolean Search_(TreeNode node, int x) {
        if (node == null) {
            return false;
        }
        if(node.data != x)
            if(!Search_(node.leftNode, x))
                return Search_(node.rightNode, x);
        return true;
    }

    private void preorder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.leftNode);
        preorder(node.rightNode);
    }

    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.leftNode);
        System.out.print(node.data + " ");
        inorder(node.rightNode);
    }

    private void postorder(TreeNode node) {
        if (node == null) {
            return;
        }
        postorder(node.leftNode);
        postorder(node.rightNode);
        System.out.print(node.data + " ");
    }
}
