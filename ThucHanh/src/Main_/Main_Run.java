/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_;

import Chuong1.DanhSach;
import Chuong1.Queue_;
import Chuong1.Stack_;
import Chuong1.Tree;

/**
 *
 * @author Admin
 */
public class Main_Run {

    /**
     * @param n số nguyên dươnng
     */
    public static void Bai_1_Chuong_1_PrindBinaryInt(int n){
        Stack_ stack = new Stack_();
        while(n>0){
            stack.push(n%2); 
            n=n/2;
        }
        stack.print();
    }
    
    public static void Bai_2_Chuong_1_Search(int x){
        Tree tree = new Tree();
        int value=1;
        for (int i = 1; i <= 10; i++) {
            value = (int) (Math.random() * 100);
            tree.insertNode(value);
        }
        //có thể có có thể không
        System.out.println("kết quả tìm kiếm x: "+tree.Search(x));
        //chắc chắn có
        System.out.println("kết quả tìm kiếm value: "+tree.Search(value));
    }
    /**
     *
     * @param args tham số truyền vào
     */
    public static void main(String[] args) {
        System.out.println("Thực hành linked list");
        DanhSach list = new DanhSach();
        list.insertAtFront(5);
        list.insertAtFront(7);
        list.insertAtBack(9);
        list.insertAtBack(8);
        list.insertAtBack(4);
        list.print();
        list.removeFromFront();
        list.removeFromBack();
        list.print();
        System.out.println("kết thúc thực hành linked list");
        System.out.println("\n\n\n");

        System.out.println("Thực hành stack");
        Stack_ stack = new Stack_();
        stack.push(5);
        stack.push(7);
        stack.push(4);
        stack.push(8);
        stack.print();
        stack.pop();
        stack.pop();
        stack.print();
        System.out.println("kết thúc thực hành stack");
        System.out.println("\n\n\n");

        System.out.println("Thực hành Queue");
        Queue_ queue = new Queue_();
        queue.enqueue(5);
        queue.enqueue(7);
        queue.enqueue(4);
        queue.enqueue(8);
        queue.print();
        queue.dequeue();
        queue.dequeue();
        queue.print();
        System.out.println("kết thúc thực hành queue");
        System.out.println("\n\n\n");

        System.out.println("Thực hành binary search tree");
        Tree tree = new Tree();
        int value;
        for (int i = 1; i <= 10; i++) {
            value = (int) (Math.random() * 100);
            tree.insertNode(value);
        }
        System.out.println("\n\nPreorder traversal");
        tree.preorderTraversal();
        System.out.println("\n\nInorder traversal");
        tree.inorderTraversal();
        System.out.println("\n\nPostorder traversal");
        tree.postorderTraversal();
        System.out.println("kết thúc thực hành binary search tree");
        System.out.println("\n\n\n");
        
        System.out.println("Thực hành bài 1 chương 1");
        Bai_1_Chuong_1_PrindBinaryInt(8);
        System.out.println("kết thúc bài 1 chương 1");
        System.out.println("\n\n\n");
        
        
        System.out.println("Thực hành bài 2 chương 1");
        Bai_2_Chuong_1_Search(0);
        System.out.println("kết thúc bài 2 chương 1");
        System.out.println("\n\n\n");
        
    }

}
