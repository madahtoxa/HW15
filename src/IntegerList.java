public interface IntegerList {
    Integer add(Integer item);
    Integer add(String item);
    Integer add(int index, Integer item);
    String set(int index, String item);
    Integer set(int index, Integer item);
    Integer remove(Integer item) throws ElementNotFoundException;
    Integer remove(int index);

    int indexOf(Integer item);
    int lastIndexOf(Integer item);
    Integer get(int index);

    int size();
    boolean isEmpty();
    void clear();

    Integer[] toInteger();
}
