package TestList;

import myLists.MyLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSortDown {

    @Test
    public void testSortDownCorrectList() throws Exception {
        MyLinkedList list = new MyLinkedList();
        list.add(8);
        list.add(-2);
        list.add(4);
        list.add(-4);
        list.add(9);
        list.add(100);
        list.add(-100);
        Integer expectedHead = 100;
        Integer expectedTail = -100;
        Integer expectedSize = 7;
        list.sortDown();
        Integer actualHead = list.getHead();
        Integer actualTail = list.getTail();
        Integer actualSize = list.getSize();
        assertEquals(expectedHead, actualHead);
        assertEquals(expectedTail, actualTail);
        assertEquals(expectedSize, actualSize);
    }

    @Test (expected = Exception.class)
    public void testSortDownEmptyList() throws Exception {
        MyLinkedList list = new MyLinkedList();
        try {
            list.sortDown();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @Test (expected = Exception.class)
    public void testSortDownOnlyNulls() throws Exception {
        MyLinkedList list = new MyLinkedList();
        list.add(null);
        list.add(null);
        list.add(null);
        try {
            list.sortDown();
        } catch (Exception e) {
            throw new Exception(e);
        };
    }

    @Test (expected = Exception.class)
    public void testSortDownOneNull() throws Exception {
        MyLinkedList list = new MyLinkedList();
        list.add(2);
        list.add(5);
        list.add(null);
        try {
            list.sortDown();
        } catch (Exception e) {
            throw new Exception(e);
        };
    }

    @Test
    public void testSortDownOnlyZeroes() throws Exception {
        MyLinkedList list = new MyLinkedList();
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        Integer expectedHead = 0;
        Integer expectedTail = 0;
        Integer expectedSize = 7;
        list.sortDown();
        Integer actualHead = list.getHead();
        Integer actualTail = list.getTail();
        Integer actualSize = list.getSize();
        assertEquals(expectedHead, actualHead);
        assertEquals(expectedTail, actualTail);
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testSortDownListWithSameIntNotZero() throws Exception {
        MyLinkedList list = new MyLinkedList();
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        Integer expectedHead = 5;
        Integer expectedTail = 5;
        Integer expectedSize = 7;
        list.sortDown();
        Integer actualHead = list.getHead();
        Integer actualTail = list.getTail();
        Integer actualSize = list.getSize();
        assertEquals(expectedHead, actualHead);
        assertEquals(expectedTail, actualTail);
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testSortDownListWithSortedElements() throws Exception {
        MyLinkedList list = new MyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        Integer expectedHead = 7;
        Integer expectedTail = 1;
        Integer expectedSize = 7;
        list.sortDown();
        Integer actualHead = list.getHead();
        Integer actualTail = list.getTail();
        Integer actualSize = list.getSize();
        assertEquals(expectedHead, actualHead);
        assertEquals(expectedTail, actualTail);
        assertEquals(expectedSize, actualSize);
    }

}
