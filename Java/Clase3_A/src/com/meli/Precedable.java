package com.meli;

public interface Precedable<T> extends Comparable<T>{

    public abstract int precedeAT(T t);
}
