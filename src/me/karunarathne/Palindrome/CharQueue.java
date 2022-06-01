package me.karunarathne.Palindrome;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CharQueue implements java.util.Queue {
    private List<Character> charArray;

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
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

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
     * 
     * @return
     */
    @Override
    public Iterator iterator() {
        return null;
    }

    /**
     * not implemented
     * @return
     */
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    /**
     * not implemented
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
     * not implemented
     * @param o element to be removed from this collection, if present
     * @return
     */
    @Override
    public boolean remove(Object o) {
        return false;
    }

    /**
     * not implemented
     * @param c collection containing elements to be retained in this collection
     * @return
     */
    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    /**
     * not implemented
     * @param c collection containing elements to be removed from this collection
     * @return
     */
    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    /**
     * not implemented
     * @param c collection to be checked for containment in this collection
     * @return
     */
    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    /**
     * not implemented
     * @param o the element to add
     * @return
     */
    @Override
    public boolean offer(Object o) {
        return false;
    }

    /**
     * not implemented
     * @return
     */
    @Override
    public Object remove() {
        return null;
    }

    /**
     * not implemented
     * @return
     */
    @Override
    public Object poll() {
        return null;
    }

    /**
     * not implemented
     * @return
     */
    @Override
    public Object element() {
        return null;
    }

    /**
     * not implemented
     * @return
     */
    @Override
    public Object peek() {
        return null;
    }
}
