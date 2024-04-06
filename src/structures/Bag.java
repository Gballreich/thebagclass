package structures;

import adts.IBag;

import java.util.Arrays;

public class Bag implements IBag {
    private Object[] data;
    private int size;

    public Bag(int capacity){
        if(capacity < 0){
            throw new IllegalArgumentException("Bad bag capacity: " + capacity);
        }
        data = new Object[capacity];
    }
    @Override
    public boolean add(Object toAdd) {
        if(size == data.length){
            return false;
        }
        data[size] = toAdd;
        size++;
        return true;
    }

    @Override
    public boolean contains(Object searchFor) {
        //only check the used side of our array
        for (int i = 0; i < size; i++) {
            if (data[i].equals(searchFor)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return data.length;
    }

    @Override
    public boolean remove(Object searchFor) {
        if(!contains(searchFor)) {
            return false;
        }
        //search for the element
        for(int i = 0; i < size; i++){

            if(data[i].equals(searchFor)){
                //and shift accordingly
                for (int j = i + 1; j < size ; j++) {
                    data[j - 1] = data[j];
                }
                data[size-1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void clear() {
        // data = new Object[capacity];
        size = 0;
    }

    @Override
    public String toString() {
        return "Bag: " + Arrays.toString(data);
    }
}
