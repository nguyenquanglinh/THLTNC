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
public class Node {

    int data;
    Node next;

    Node(int value) {
        this(value, null);
    }

    Node(int value, Node node) {
        data = value;
        next = node;
    }

    int getData() {
        return data;
    }

    Node getNext() {
        return next;
    }
}
