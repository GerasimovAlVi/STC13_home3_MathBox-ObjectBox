package ru.innopolis.hom_work;

import java.util.*;

public class MathBox<T extends Number> extends ObjectBox{
    private Set<T> collection = new TreeSet<>();

    public MathBox(T[] array) {
        //Set<T> set = new TreeSet<>(Arrays.asList(array));
        for (T i:array){
            collection.add((T)(Double)i.doubleValue());
        }
        //this.collection = set;
        if (array.length != collection.size()){
            System.out.println("В исходном массиве обнаружены повторяющиеся элементы!");
        }
    }

    public Double summator(){
        Double summ = new Double(0.0);
        for (T i: collection){
            summ += i.doubleValue();
        }
        return summ;
    }

    public Set<T> splitter(double del) throws ArithmeticException{
        if (del == 0.0){
            throw new ArithmeticException("Деление на 0!");
        }
        Set<T> set2 = new TreeSet<>();
        for (T i: collection){
            set2.add((T)(Double)(i.doubleValue()/del));
        }
        return set2;
    }

    @Override
    public void addObject(Object o) throws MyException {
        if (o instanceof Number){
            collection.add((T) (Double) (((Number) o).doubleValue()));
        }else{
            throw new MyException("Можно добавлять только Number и его потомков!");
        }
    }

    @Override
    public void dump() {
        super.dump();
    }

    @Override
    public void deleteObject(Object o) {
        collection.remove((T) (Double)((Number)o).doubleValue());
    }

    /*public void delete(int number){
        collection.remove(number);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return Objects.equals(collection, mathBox.collection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collection);
    }

    @Override
    public String toString() {
        return "" + collection;
    }
}
