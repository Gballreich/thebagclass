package adts;

public interface IBag {

    /**
     * adds an element to the bag if there is space.
     * @param toAdd te element
     * @return true if the element was added or false otherwise
     */
    boolean add(Object toAdd);
    boolean contains(Object searchFor);
    int size();
    int capacity();
    boolean remove(Object searchFor);
    boolean isEmpty();
    void clear();

}
