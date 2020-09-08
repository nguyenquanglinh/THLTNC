/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_;

import Chuong1.*;
import java.util.*;

/**
 *
 * @author Admin
 */
public class Main_Run {

    /**
     * @param n số nguyên dươnng
     */
    public static void Bai_1_Chuong_1_PrindBinaryInt(int n) {
        Stack_ stack = new Stack_();
        while (n > 0) {
            stack.push(n % 2);
            n = n / 2;
        }
        stack.print();
    }

    public static void Bai_2_Chuong_1_Search(int x) {
        Tree tree = new Tree();
        int value = 1;
        for (int i = 1; i <= 10; i++) {
            value = (int) (Math.random() * 100);
            tree.insertNode(value);
        }
        //có thể có có thể không
        System.out.println("kết quả tìm kiếm x: " + tree.Search(x));
        //chắc chắn có
        System.out.println("kết quả tìm kiếm value: " + tree.Search(value));
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

        System.out.println("Thực hành tree set test 1");
        SortedSet names = new TreeSet();
        names.add("Minh Tuan");
        names.add("Hai Nam");
        names.add("Anh Ngoc");
        names.add("Trung Kien");
        names.add("Quynh Chi");
        names.add("Thu Hang");
        System.out.println(names);
        System.out.println("kết thúc tree set test 1");
        System.out.println("\n\n\n");

        System.out.println("Thực hành tree set test 2");
        SortedSet<Student> stu = new TreeSet<>();
        stu.add(new Student("A05726", 8.5));
        stu.add(new Student("A06338", 7.0));
        stu.add(new Student("A05379", 7.5));
        stu.add(new Student("A06178", 9.5));
        Student st1 = new Student("A06338", 7.0);
        System.out.println(stu);
        System.out.println("Thực hành tree set test 2 sắp xếp");
        SortedSet<Student> sortByScore = new TreeSet<Student>(new Comparator<Student>() {
            public int compare(Student itemA, Student itemB) {
                double check = itemA.getScore() - itemB.getScore();
                if (check > 0) {
                    return 1;
                }
                return 0;

            }
        }); // end of inner class
        sortByScore.addAll(stu);//
        System.out.println(sortByScore);

        List lst = new ArrayList();
        lst.addAll(stu);
        int i;
        i = Collections.binarySearch(lst, st1);
        if (i >= 0) {
            System.out.print(st1.getScore() + "Found");
        }
        System.out.println("kết thúc tree set test 2");
        System.out.println("\n\n\n");
        
        
        
        System.out.println("Thực hành HashMap");
        Map phoneDir = new HashMap();
        phoneDir.put("5581814", new String("Dept. Informatics"));
        phoneDir.put("8584490", new String("Defense Staff"));
        phoneDir.put("8587346", new String("Administrative Staff"));
        phoneDir.put("7290028", new String("Student Club"));
        System.out.println(phoneDir);
        phoneDir.remove("8584490");
        phoneDir.put("7290028", new String("International Relation"));
        System.out.println(phoneDir.get("5581814"));
        Set entries = phoneDir.entrySet();
        Iterator iter = entries.iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            String key = (String) entry.getKey();
            String value_ = (String) entry.getValue();
            System.out.println("key=" + key + ", value=" + value_);
        }
        System.out.println("kết thúc HashMap");
        System.out.println("\n\n\n");
    }
}
