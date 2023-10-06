package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

public class ArrayBasedImpl implements StackOfInts {
    /**
     *     pop() method : method indicates that the function has not yet been implemented
     */
    @Override
    public int pop() {
        int res = array[numOfElems-1];

        int [] temp = new int[size - 1];
        for (int i=0; i<numOfElems -1; i++){
            temp[i] = array[i];
        }
        array = temp;
        size--;
        numOfElems--;
        return res;
        //throw new IllegalStateException("To be implemented");
    }
    /**
     *     push() method : method indicates that the function has not yet been implemented
     */
    @Override
    public void push(int x) {
        if (numOfElems == size){
            int[] temp = new int[size + 1];

            for(int i =0; i<numOfElems; i++){
                temp[i] = array[i];
            }

            array = temp;
            size +=1;
        }

        this.array[numOfElems] = x;

        numOfElems++;

        //throw new IllegalStateException("To be implemented");
    }
    /**
     * numOfElems() overriding public method from StackOfInts interface, parameter : void, return type : int
     */
    @Override
    public int numOfElems() {
        return numOfElems;
    }
    /**
     *     peek() method : method indicates that the function has not yet been implemented
     */
    @Override
    public int peek() {
        return array[0];
        //throw new IllegalStateException("To be implemented");
    }

    private int[] array;
    private int size;
    public ArrayBasedImpl(){
        array = new int [0];
        size = 0;
    }
    private int numOfElems = 0;
}
