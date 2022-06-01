package me.karunarathne.Palindrome;

import java.util.Collection;
import java.util.Iterator;

public class Queue implements java.util.Queue {
    

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * not needed
     * @param o element whose presence in this collection is to be tested
     * @return
     */
    @Override
    public boolean contains(Object o) {
        return false;
    }

    /**
     * not using here, but useful
     * @return
     */
    @Override
    public Iterator iterator() {
        return null;
    }

    /**
     * not needed
     * @return
     */
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    /**
     * not needed
     * @param a the array into which the elements of this collection are to be
     *        stored, if it is big enough; otherwise, a new array of the same
     *        runtime type is allocated for this purpose.
     * @return
     */
    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    /**
     * Add an element to the queue
     * @param o element whose presence in this collection is to be ensured
     * @return
     */
    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean offer(Object o) {
        return false;
    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public Object poll() {
        return null;
    }

    @Override
    public Object element() {
        return null;
    }

    @Override
    public Object peek() {
        return null;
    }
}
