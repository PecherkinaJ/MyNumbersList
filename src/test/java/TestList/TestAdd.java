package TestList;

import myLists.MyArray;
import myLists.MyLinkedList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestAdd {
    private final Integer[] elements;
    private final int currentSize;

    public TestAdd(Integer[] elements, int currentSize) {
        this.elements = elements;
        this.currentSize = currentSize;
    }

    @Parameterized.Parameters(name = "test №{index}")
    public static Object[] array() {
        return new Object[][]{
                {new Integer[]{}, 0},
                {new Integer[]{1}, 1},
                {new Integer[]{1, 2}, 2},
                {new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 9},
                {new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10},
                {new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                               11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                               21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                               31, 32, 33, 34, 35, 36, 37, 38, 39, 40}, 40},
        };
    }

    @Test
    public void testAdd() {
        MyLinkedList list = new MyLinkedList();
        for (Integer element : elements) {
            list.add(element);
        }
        assertEquals(currentSize, list.getSize());
    }

}
