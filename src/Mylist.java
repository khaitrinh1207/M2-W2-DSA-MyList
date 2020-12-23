import java.util.Arrays;

public class Mylist<E> {
    private int size =0;
    private static final int DEFAUL_CAPACITY = 10;
    private Object elements[];

    public Mylist(){
        elements = new Object[DEFAUL_CAPACITY];
    }

    private void ensureCape() {
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if ( size == elements.length){
            ensureCape();
        }
        elements[size++] = e;
    }

    public E get(int i){
        if( i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index : "+i+", size"+i);
        }
        return  (E) elements[i];
    }

}
