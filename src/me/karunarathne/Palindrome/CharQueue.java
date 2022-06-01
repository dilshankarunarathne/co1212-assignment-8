package me.karunarathne.Palindrome;

import java.util.*;

public class CharQueue implements Queue {
    private List<Character> charArray;

    public CharQueue() {
        charArray = new ArrayList<>();
    }

    public CharQueue(String word) {
        this();
        charArray.addAll(Arrays.asList(word));
    }

    /**
     * Add an element to the queue
     * @param o element whose presence in this collection is to be ensured
     * @return
     */
    @Override
    public boolean add(Object o) {
        return charArray.add((Character) o);
    }

    /**
     * not needed
     * Removes all elements in the Queue
     */
    @Override
    public void clear() {
        charArray.clear();
    }

    /**
     * not needed
     * Size (number of elements) in the Queue
     * @return number of elements
     */
    @Override
    public int size() {
        return charArray.size();
    }

    /**
     * not needed
     * Check whether the Queue is empty
     * @return is the Queue empty
     */
    @Override
    public boolean isEmpty() {
        return charArray.isEmpty();
    }

    /**
     * not needed
     * @param c collection containing elements to be added to this collection
     * @return
     */
    @Override
    public boolean addAll(Collection c) {
        return charArray.addAll(c);
    }

    /**
     * not needed
     * @return
     */
    @Override
    public Iterator iterator() {
        return charArray.iterator();
    }

    /**
     * not needed
     * @param o element whose presence in this collection is to be tested
     * @return
     */
    @Override
    public boolean contains(Object o) {
        return charArray.contains((Character) o);
    }

    /**
     * not needed
     * @return
     */
    @Override
    public Object[] toArray() {
        return charArray.toArray();
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
