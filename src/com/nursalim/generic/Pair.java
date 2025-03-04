package com.nursalim.generic;

public class Pair <T, U>{
    private T first;
    private U last;

    public Pair(T first, U last) {
        this.first = first;
        this.last = last;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setLast(U last) {
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public U getLast() {
        return last;
    }
}
