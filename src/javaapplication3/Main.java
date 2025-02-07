package javaapplication3;

// =========================================================
// Do NOT modify this file 
// =========================================================
import java.io.*;
import java.util.*;

class Main {

    public static void main(String args[]) throws Exception {

        MyQueue t = new MyQueue();

        int choice;
        do {
            printMenu();
            choice = Lib.getInt("Input choice : ");
            switch (choice) {
                case 1:
                    t.add();
                    break;
                case 2:
                    t.removeFirst();
                    break;
                case 3 : 
                    t.viewTop();
                    break;
                case 4 :
                    break;
                default:
                    throw new AssertionError();
            }
        } while (choice != 4);

        System.out.println();
    }

    private static void printMenu() {
        System.out.println("=============MENU=============");
        System.out.println("1. Add last ");
        System.out.println("2. Remove first ");
        System.out.println("3. View top ");
        System.out.println("4. exit ");
        System.out.println("==============================");
        System.out.print("Enter your choice [0 --> 4]: ");
    }
}
