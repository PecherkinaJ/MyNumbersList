package TestList;

import myLists.MyArray;
import myLists.MyLinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFind {

    @Test
    public void findCorrectPositionShouldGiveCorrectElement(){
        MyLinkedList list = new MyLinkedList();
        list.add(0);
        list.add(2);
        list.add(4);
        Integer expected = 0;
        Integer actual = list.find(1);
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void findIncorrectPositionShouldThrowException() throws Exception {
        MyLinkedList list = new MyLinkedList();
        try {
            list.find(10);
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
