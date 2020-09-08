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
public class Queue_ {
    private DanhSach queueList;

    public Queue_() {
        queueList = new DanhSach();
    }

    public void enqueue(int value) {
        queueList.insertAtBack(value);
    }

    public int dequeue() {
        return queueList.removeFromFront();
    }

    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    public void print() {
        queueList.print();
    }
}
