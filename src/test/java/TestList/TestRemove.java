package TestList;

import myLists.MyArray;
import myLists.MyLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRemove {

    @Test
    public void removeHeadShouldGiveNewHead(){
        MyLinkedList list = new MyLinkedList();
        list.add(0);
        list.add(2);
        list.add(4);
        Integer expectedHead = 2;
        Integer expectedSize = 2;
        list.remove(1);
        Integer actualHead = list.getHead();
        Integer actualSize = list.getSize();
        assertEquals(expectedHead, actualHead);
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void removeMiddleElementShouldGiveSameHeadAndTail(){
        MyLinkedList list = new MyLinkedList();
        list.add(0);
        list.add(2);
        list.add(4);
        list.add(6);
        Integer expectedHead = 0;
        Integer expectedTail = 6;
        Integer expectedSize = 3;
        list.remove(3);
        Integer actualHead = list.getHead();
        Integer actualTail = list.getTail();
        Integer actualSize = list.getSize();
        assertEquals(expectedHead, actualHead);
        assertEquals(expectedTail, actualTail);
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void removeTailShouldGiveNewTail(){
        MyLinkedList list = new MyLinkedList();
        list.add(0);
        list.add(2);
        list.add(4);
        list.add(6);
        Integer expectedTail = 4;
        Integer expectedSize = 3;
        list.remove(4);
        Integer actualTail = list.getTail();
        Integer actualSize = list.getSize();
        assertEquals(expectedTail, actualTail);
        assertEquals(expectedSize, actualSize);
    }

    @Test(expected = Exception.class)
    public void removeIncorrectPositionShouldThrowException() throws Exception {
        MyLinkedList list = new MyLinkedList();
        try {
            list.remove(10);
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
