package IteratorPattern;

import java.util.Iterator;

//generic interface with iterator method
public interface Set <T> {
    public void add (T t) throws Exception;
    public void remove (T t);
    public boolean contains (T t);
    public int size();
    public Iterator <T> getIterator();

}
