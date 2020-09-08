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
public class TreeNode {

    int data;
    TreeNode leftNode, rightNode;

    public TreeNode(int nodeData) {
        data = nodeData;
        leftNode = rightNode = null;
    }

    public void insert(int value) {
        if (value < data) {
            if (leftNode == null) {
                leftNode = new TreeNode(value);
            } else {
                leftNode.insert(value);
            }
        } else if (value > data) {
            if (rightNode == null) {
                rightNode = new TreeNode(value);
            } else {
                rightNode.insert(value);
            }
        }
    }
}
