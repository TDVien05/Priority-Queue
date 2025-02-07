/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author DELL
 */
public class Node {
    Customer info;
    Node next;

    public Node() {
    }

    public Node(Customer info, Node next) {
        this.info = info;
        this.next = next;
    }

    public Customer getInfo() {
        return info;
    }

    public void setInfo(Customer info) {
        this.info = info;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
