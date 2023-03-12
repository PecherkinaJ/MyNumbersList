package TestArray;

import myLists.MyArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSortUp {

    @Test
    public void testSortLessThan10Elements(){
        MyArray array = new MyArray();
        array.add(8);
        array.add(-2);
        array.add(4);
        Integer[] expected = {-2, 4, 8, null, null, null, null, null, null, null};
        array.sortUp();
        Integer[] actual = array.getArray();
        assertEquals(expected, actual);
    }

    @Test
    public void testSortEmptyArray(){
        MyArray array = new MyArray();
        Integer[] expected = {null, null, null, null, null, null, null, null, null, null};
        array.sortUp();
        Integer[] actual = array.getArray();
        assertEquals(expected, actual);
    }

    @Test
    public void testSortZeroesArray(){
        MyArray array = new MyArray();
        array.add(0);
        array.add(0);
        array.add(0);
        array.add(0);
        array.add(0);
        Integer[] expected = {0, 0, 0, 0, 0, null, null, null, null, null};
        array.sortUp();
        Integer[] actual = array.getArray();
        assertEquals(expected, actual);
    }

    @Test
    public void testSortArrayWithMoreThan10Elements(){
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
        Integer[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null,};
        array.sortUp();
        Integer[] actual = array.getArray();
        assertEquals(expected, actual);
    }

    @Test
    public void testSortArrayWithSortedElements(){
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
        Integer[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8, null};
        array.sortUp();
        Integer[] actual = array.getArray();
        assertEquals(expected, actual);
    }

}
