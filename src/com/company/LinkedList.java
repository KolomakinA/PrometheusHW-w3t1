package com.company;

public class LinkedList {
    private Node[] n;
    private int i;
    public LinkedList() {
        n = new Node[0];//Initial array of nodes
        i=0;//Dynamic length of array
    }

    public void add(Integer data) {
        if (n.length != 0) {
            Node[] r = new Node[n.length];
            for (int j = 0; j < n.length; j++) r[j] = n[j];
            n = new Node[n.length + 1];
            for (int j = 0; j < r.length; j++) n[j] = r[j];
        } else {
            n=new Node[1];
        }
        n[i]= new Node();
        n[i].setData(data);
        if (i != 0) n[i-1].setNext(n[i]);
        i++;

    }

    public Integer get(int index) {
        return n[index].getData();
    }

    public boolean delete(int index) {
        if (index < 0 || index >= n.length-1) return false;
        if (n.length > 2) n[index-1].setNext(n[index+1]);
        Node[] r = new Node[n.length];
        for (int j = 0; j < n.length; j++) r[j] = n[j];
        n = new Node[n.length-1];
        for (int j = 0; j < index ; j++) {
            n[j]=r[j];
        }
        for (int j = index+1; j < r.length ; j++) {
            n[j-1]=r[j];
        }
        i--;
        return true;

    }

    public int size() {
        return n.length;
    }
}
