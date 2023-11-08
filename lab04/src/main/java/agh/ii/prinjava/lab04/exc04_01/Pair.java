package agh.ii.prinjava.lab04.exc04_01;

import jdk.jfr.Percentage;

public class Pair<F,S> implements Cloneable {
    private F x;
    private S y;
    public Pair(){
    }
    public Pair(F x, S y){
        this.x = x;
        this.y = y;
    }
    public F getX() {
        return x;
    }
    public S getY() {
        return y;
    }
    public void setX(F x) {
        this.x = x;
    }
    public void setY(S y) {
        this.y = y;
    }

    @Override
    public String toString(){
        return "Par = {x = " + x + ", y = " + "}";
    }
    @Override
    public int hashCode(){
        return x.hashCode() * y.hashCode();
    }

    @Override
    public boolean equals(Object  o){
        if(this == o){
            return true;
        }
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        Pair<?, ?> p = (Pair<?, ?>) o ;
        return x.equals(p.x) && y.equals(p.y);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
