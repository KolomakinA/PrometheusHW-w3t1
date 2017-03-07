package com.company;

public class Main {

    public static void main(String[] args) {
	    LinkedList list = new LinkedList();
	    for (int i = 0; i < 10; i++) {
            list.add(i);
        }
	    list.add(10);
        System.out.println(list.size());
        System.out.println(list.delete(-1));
        System.out.println(list.delete(12));
        System.out.println(list.size());
        list.delete(10);
        System.out.println(list.size());
        list.delete(0);
        System.out.println(list.size());
        for (int i = 0; i < 9; i++) {
            System.out.println(list.get(i));
        }
    }
}
