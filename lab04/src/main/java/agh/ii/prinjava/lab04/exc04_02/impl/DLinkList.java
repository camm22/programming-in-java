package agh.ii.prinjava.lab04.exc04_02.impl;

/**
 * Doubly-Linked List implementation
 * @param <E> the type of elements stored in the list
 */
public class DLinkList<E> {
    private int numberOfElem;
    private Node<E> first;
    private Node<E> last;

    /**
     * Node class representing individual elements in the list
     * @param <T> the type of elements stored in the node
     */
    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;
        public Node(T elem){
            this.elem = elem;
            next = null;
            prev = null;
        }
        public Node(){
            this(null);
        }
    }

    /**
     * Custom exception for when trying to remove an element from an empty list
     */
    public static class DLinkListEmptyException extends Exception{
        public DLinkListEmptyException(String mess){
            super(mess);
        }

    }

    /**
     * Add an element at the beginning of the list
     * @param elem the element that we add to the list
     */
    public void addFirst(E elem){
        Node<E> node= new Node<>(elem);
        if (isEmpty()){
            first =  node;
            last = node;
            numberOfElem ++;
            return;
        }
        Node<E> temp = first;
        temp.prev = node;
        node.next = temp;
        first = node;
        numberOfElem ++;
    }

    /**
     * Add an element at the end of the list
     * @param elem the element that we add to the list
     */
    public void addLast(E elem){
        Node<E> node = new Node<>(elem);
        if (isEmpty()){
            first = node;
            last = node;
            numberOfElem ++;
            return;
        }
        Node<E> temp =last;
        node.prev = last;
        temp.next = node;
        last = node;
        numberOfElem ++;
    }

    /**
     * Remove and returns the first element of the list
     * @return the first element of the list
     */
    public E removeFirst(){
        E res = null;
        try {
            if (isEmpty()) {
                throw new DLinkListEmptyException("Cannot remove from an empty list !");
            }
            res = first.elem;
            if(numberOfElem ==1){
                first = null;
                last = null;
                return res;
            }
            Node<E> temp = first.next;
            temp.prev = null;
            first = temp;
            numberOfElem--;


        }catch(DLinkListEmptyException e){
            System.out.println("Error : " + e.getMessage());
        }
        return res;
    }

    /**
     * Remove and returns the last element of the list
     * @return the last element of the list
     */
    public E removeLast(){
        E res = null;
        try {
            if (isEmpty()) {
                throw new DLinkListEmptyException("Cannot remove from an empty list !");
            }
            res = last.elem;
            if (numberOfElem == 1){
                first = null;
                last = null;
                return res;
            }
            Node<E> temp = last.prev;
            temp.next = null;
            last = temp;
            numberOfElem--;
        }catch(DLinkListEmptyException e){
            System.out.println("Error : " + e.getMessage());
        }
        return res;
    }

    /**
     * Check if the list is empty
     * @return {@code true} if list is empty, {@code false} otherwise
     */
    public boolean isEmpty(){
        return numberOfElem == 0;
    }

    /**
     * Returns a string representation of the list
     *
     * @return a string representation of the list
     */
    @Override
    public String toString(){
        String res = "";
        Node<E> temp = first;
        if(isEmpty()){
            res += "[NULL]";
        }
        while (temp != null){
            if(temp.prev == null){
                res += "[NULL]<-->";
            }

            res += "[@|" + temp.elem + "|@]<-->";

            if(temp.next == null){
                res += "[NULL]";
            }

            temp = temp.next;
        }
        return res;
    }

    /**
     * get the number of elements in a list
     * @return the number of element
     */
    public int getNumberOfElem() {
        return numberOfElem;
    }

    /**
     * Return the first element of the list without removing it
     * @return the first element
     */
    public E peekFirst(){
        return first.elem;
    }

    /**
     * Return the last element of the list without removing it
     * @return the last element
     */
    public E peekLast(){
        return last.elem;
    }
}
