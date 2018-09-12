package ru.innopolis.hom_work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws ArithmeticException, MyException {
        Number[] arr = new Number[]{5,1d,58,4.5,686,7};

        MathBox mathBox = new MathBox(arr);
        mathBox.dump();
        System.out.println(mathBox.summator());
        System.out.println(mathBox.splitter(2.5));
        //mathBox.delete(5);
        mathBox.deleteObject(5);
        mathBox.dump();
        mathBox.addObject(6);
        mathBox.dump();


        Collection<Object> collection = new ArrayList<>(Arrays.asList(1, 4, "123", 8, null));
        ObjectBox objectBox= new ObjectBox(collection);
        objectBox.dump();
        objectBox.addObject("qwert");
        objectBox.dump();
        objectBox.deleteObject(4);
        objectBox.dump();
    }
}
