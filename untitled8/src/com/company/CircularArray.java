package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class CircularArray<T> implements Iterable<T>{

    private ArrayList<T> persistData;


    public CircularArray() {
        persistData = new ArrayList<>();
    }



    public T getElement(int index) {

        if(index < persistData.size()) {
            return persistData.get(index);
        } else {
            return persistData.get(index % persistData.size());
        }
    }



    public void addData(T element) {
        persistData.add(element);
    }


    public int getSize() {
        return persistData.size();
    }

    public Iterator<T> getData() {
        return persistData.iterator();
    }


    @Override
    public Iterator<T> iterator() {
        return this.getData();
    }
}
