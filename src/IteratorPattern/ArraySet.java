package IteratorPattern;

import java.util.Iterator;

public class ArraySet <T> implements Set {
   private Object array [];
   private int nbElements;
   public ArraySet (int maxsize){
       array = new Object[maxsize];
       nbElements = 0;
   }

    @Override
    public void add(Object o) throws Exception {
        if (contains(o)) throw new Exception();
        if (nbElements == array.length)throw new Exception();

    }

    @Override
    public void remove(Object o) {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator getIterator() {
        return null;
    }
}
