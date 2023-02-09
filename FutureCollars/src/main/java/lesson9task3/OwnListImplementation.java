package lesson9task3;

public class OwnListImplementation<E> implements OwnList<E> {

    private Object[] values;
    private int size;

    public OwnListImplementation() {
        values = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public boolean add(E element) {
        resize();
        values[size] = element;
        size++;
        return true;
    }

    @Override
    public E get(int i) {
        if (i < size && i >= 0) {
            return (E) values[i];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public boolean remove(E o) {
        int index = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i].equals(o)) {
                index = i;
                break;
            }
        }
        remove(index);
        return index != -1;
    }

    @Override
    public int size() {
        return size;
    }

    private void remove(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(values, index + 1, values, index, size - index - 1);
        values[--size] = null;
        resize();
    }

    private void resize() {
        if (size >= DEFAULT_CAPACITY) {
            Object[] newValues = new Object[size * 3 / 2 + 1];
            System.arraycopy(values, 0, newValues, 0, size);
            values = newValues;
        }
    }
}
