package TestArray;

import myLists.MyArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSortDown {


    @Test
    public void testSortLessThan10Elements() throws Exception {
        MyArray array = new MyArray();
        array.add(8);
        array.add(-2);
        array.add(4);
        Integer[] expected = {8, 4, -2, null, null, null, null, null, null, null};
        array.sortDown();
        Integer[] actual = array.getArray();
        assertEquals(expected, actual);
    }

    @Test (expected = Exception.class)
    public void testSortEmptyArray() throws Exception {
        MyArray array = new MyArray();
        try {
            array.sortDown();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @Test
    public void testSortZeroesArray() throws Exception {
        MyArray array = new MyArray();
        array.add(0);
        array.add(0);
        array.add(0);
        array.add(0);
        array.add(0);
        Integer[] expected = {0, 0, 0, 0, 0, null, null, null, null, null};
        array.sortDown();
        Integer[] actual = array.getArray();
        assertEquals(expected, actual);
    }

    @Test
    public void testSortArrayWithMoreThan10Elements() throws Exception {
        MyArray array = new MyArray();
        array.add(0);
        array.add(2);
        array.add(1);
        array.add(4);
        array.add(3);
        array.add(6);
        array.add(5);
        array.add(7);
        array.add(10);
        array.add(9);
        array.add(8);
        Integer[] expected = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0,
                null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null,};
        array.sortDown();
        Integer[] actual = array.getArray();
        assertEquals(expected, actual);
    }

    @Test
    public void testSortArrayWithSortedElements() throws Exception {
        MyArray array = new MyArray();
        array.add(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        Integer[] expected = {8, 7, 6, 5, 4, 3, 2, 1, 0, null};
        array.sortDown();
        Integer[] actual = array.getArray();
        assertEquals(expected, actual);
    }
}
