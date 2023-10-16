package agh.ii.prinjava.lab03.exc03_01.impl;

import agh.ii.prinjava.lab03.exc03_01.QueueOfInts;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;

public class LinkedListBasedImpl implements QueueOfInts, Serializable {

//    public void serializeLinkedList() {
//        try(var out = new ObjectOutputStream(Files.newOutputStream(Path.of("objectLinkedList.ser")));
//            var in new ObjectInputStream(Files.newInputStream(Path.of("objectLinkedList.ser")))){
//
//            System.out.println();
//        } catch(IOException | ClassNotFoundException e){
//            e.prin
//        }
//    }


    public static class QueueEmptyException extends Exception {
        public QueueEmptyException(String message) {
            super(message);
        }
    }


    /**
     *
     * @param x
     */
    @Override
    public void enqueue(int x) {
        Node node = new Node(x, null, null);
        if(this.isEmpty()){
            this.first = node;
            this.last = node;
            this.numOfElems++;
            return;
        }


        Node temp = this.first;
        this.first = node;
        this.first.next = temp;
        temp.prev = this.first;
        this.numOfElems++;
        //throw new IllegalStateException("To be implemented");
    }


    /**
     * @param : void
     * @return int -> element of last element in list
     * @Throws QueueEmptyException if dequeue an empty list
     */
    @Override
    public int dequeue() {
        try {
            if (this.isEmpty()) {
                throw new QueueEmptyException("Can not dequeue an empty list");
            }
            int res = this.last.elem;
            Node temp = this.last.prev;
            this.last = temp;
            if (temp == null) {
                this.first = null;
            }
            this.numOfElems--;
            return res;
        } catch(QueueEmptyException e){
            System.out.println("Error : " + e.getMessage());
            return 0;
        }
        //throw new IllegalStateException("To be implemented");
    }

    @Override
    public int numOfElems() {
        return numOfElems;
    }

    @Override
    public int peek() {
        try{
            if(this.isEmpty()){
                throw new QueueEmptyException("can not peek an empty list");
            }
            return this.first.elem;
        } catch(QueueEmptyException e){
            System.out.println("Error : " + e.getMessage());
            return 0;
        }
        //throw new IllegalStateException("To be implemented");
    }

    private static class Node {
        int elem;
        Node next;
        Node prev;

        public Node(int elem) {
            this.elem = elem;
        }

        public Node(int elem, Node next, Node prev) {
            this.elem = elem;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node first = null;
    private Node last = null;
    private int numOfElems = 0;



}
