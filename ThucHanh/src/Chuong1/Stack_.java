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
public class Stack_ {

    private DanhSach stackList;

    public Stack_() {
        stackList = new DanhSach();
    }

    public void push(int value) {
        stackList.insertAtFront(value);
    }

    public int pop() {
        return stackList.removeFromFront();
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public void print() {
        stackList.print();
    }
   
}
