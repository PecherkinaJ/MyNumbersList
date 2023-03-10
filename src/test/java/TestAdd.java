import myLists.MyArray;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.Test;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestAdd {

    private final Integer[] elements;
    private final int currentSize;
    private final int currentLength;

    public TestAdd(Integer[] elements, int currentSize, int currentLength) {
        this.elements = elements;
        this.currentSize = currentSize;
        this.currentLength = currentLength;
    }

    @Parameterized.Parameters(name = "test №{index}")
    public static Object[] array() {
        return new Object[][]{
                {new Integer[]{}, 0, 10},
                {new Integer[]{1}, 1, 10},
                {new Integer[]{1, 2}, 2, 10},
                {new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 9, 10},
                {new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10, 30},
                {new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                               11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                               21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                               31, 32, 33, 34, 35, 36, 37, 38, 39, 40}, 40, 50},
        };
    }

    @Test
    public void testAdd() {
        MyArray myArray = new MyArray();
        for (Integer element : elements) {
            myArray.add(element);
        }
        assertEquals(currentSize, myArray.getCurrentSize());
        assertEquals(currentLength, myArray.showArray().length);
    }

}
