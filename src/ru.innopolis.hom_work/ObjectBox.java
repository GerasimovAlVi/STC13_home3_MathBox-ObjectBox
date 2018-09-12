package ru.innopolis.hom_work;

import java.util.ArrayList;
import java.util.Collection;

public class ObjectBox {
    private Collection<Object> collection;


    public ObjectBox() {
    }

    public ObjectBox(Collection<Object> collection) {
        this.collection = collection;
    }

    public void addObject(Object o) throws MyException {
        collection.add(o);
    }

    public void deleteObject(Object o){
        collection.remove(o);
    }

    public void dump(){
        System.out.println(toString());;
    }

    @Override
    public String toString() {
        return "" + collection;
    }
}
