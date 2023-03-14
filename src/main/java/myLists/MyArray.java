package myLists;

public class MyArray implements MyLists {
    private Integer[] array;
    private int size = 0;
    private final static int DEFAULT_CAPACITY = 10;
    private final static int INCREASE_CAPACITY = 20;

    public MyArray() {
        //create default array
        array = new Integer[DEFAULT_CAPACITY];
    }

    @Override
    public Integer find(int position) {
        Integer toReturn;
        try {
            toReturn = array[position];
        } catch (Exception e) {
            throw new IllegalArgumentException("element not found");
        }
        return toReturn;
    }

    @Override
    public void add(Integer obj) {
        Integer[] tempArray = rewriteArrays();
        tempArray[size - 1] = obj;
        array = tempArray;
    }

    private Integer[] rewriteArrays() {
        Integer[] tempArray;
        size++;
        if (size == array.length) {
            tempArray = new Integer[array.length + INCREASE_CAPACITY];
        } else {
            tempArray = new Integer[array.length];
        }
        System.arraycopy(array, 0, tempArray, 0, array.length);
        return tempArray;
    }

    public Integer[] showArray() {
        return array;
    }

    public int getCurrentSize() {
        return size;
    }

    @Override
    public boolean remove(int position) {
        if (position < size) {
            for (int i = position + 1; i < array.length; i++) {
                    array[i - 1] = array[i];
                }
            size--;
            return true;
        } else throw new IllegalArgumentException("element doesn't exist");
    }

    @Override
    public void sortUp() throws Exception {
        if (size > 0) {
            for (int i = 0; i < size - 2; i++)
                for (int j = 0; j < size - 2; j++)
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }

        /* another way:
        for (int i = 0; i < size - 1; i++)
            for (int j = 1; j < size; j++)
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
        return array;
        */
        } else throw new IllegalArgumentException("array is empty!");
    }

    @Override
    public void sortDown() throws Exception {
        if (size > 0) {
        for (int i = 0; i < size - 2; i++)
            for (int j = 0; j < size - 2; j++)
                if (array[j] < array[j + 1]) {
                    Integer temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        /* another way:
        for (int i = 0; i < size - 1; i++)
            for (int j = 1; j < size; j++)
                if (array[j - 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
        return array;
        */
        } else throw new IllegalArgumentException("array is empty!");
    }

    public Integer[] getArray(){
        return array;
    }

    public int getSize() {
        return size;
    }
}
