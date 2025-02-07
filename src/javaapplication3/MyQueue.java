/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author DELL
 */
public class MyQueue {

    private Node head;
    int size = 0;

    public MyQueue() {
    }

    void add() {
        Customer cus = Lib.getCustomer();
        Node node = new Node(cus, null);
        
        if (head == null || cus.getPriority().compareTo(head.info.getPriority()) < 0) {
            // Nếu danh sách rỗng hoặc khách hàng mới có ưu tiên cao hơn head
            node.next = head;
            head = node;
        } else {
            // Tìm vị trí chèn phù hợp
            Node tmp = head;
            while (tmp.next != null && tmp.next.info.getPriority().compareTo(cus.getPriority()) <= 0) {
                tmp = tmp.next;
            }
            node.next = tmp.next;
            tmp.next = node;
        }

        size++;
    }

    Node removeFirst() {
        if (head == null) {
            return null;
        } else {
            if (size == 1) {
                return head;
            }
            Node tmp = head;
            head = head.next;
            size--;
            return tmp;
        }
    }

    void viewTop() {
        System.out.println("View top");
        Node tmp = head;
        while(tmp != null) {
            System.out.println(tmp.getInfo().toString());
            tmp = tmp.next;
        }
    }
}
