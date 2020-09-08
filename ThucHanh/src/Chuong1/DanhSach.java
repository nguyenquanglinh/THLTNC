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
public class DanhSach {

    private Node firsted;
    private Node lasted;

    public DanhSach() {
        firsted = lasted = null;
    }

    public boolean isEmpty() {
        return (firsted == null);
    }

    public void insertAtFront(int insertItem) {
        if (isEmpty()) {
            firsted = lasted = new Node(insertItem);
        } else {
            firsted = new Node(insertItem, firsted);
        }
    }

    public void insertAtBack(int insertItem) {
        if (isEmpty()) {
            firsted = lasted = new Node(insertItem);
        } else {
            lasted = lasted.next = new Node(insertItem);
        }
    }

    public int removeFromFront() {
        int removeItem = -1;
        if (!isEmpty()) {
            removeItem = firsted.data;
            if (firsted == lasted) {
                firsted = lasted = null;
            } else {
                firsted = firsted.next;
            }
        }
        return removeItem;
    }

    public int removeFromBack() {
        int removeItem = -1;
        if (!isEmpty()) {
            removeItem = lasted.data;
            if (firsted == lasted) {
                firsted = lasted = null;
            } else {
                Node current = firsted;
                while (current.next != lasted) {
                    current = current.next;
                }
                lasted = current;
                lasted.next = null;
            }
        }
        return removeItem;
    }

    public void print() {
        Node tmp = firsted;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println("\n");
    }
}
