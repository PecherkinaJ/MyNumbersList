package TestArray;

import myLists.MyArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFind {

    @Test
    public void findCorrectPositionShouldGiveCorrectElement(){
        MyArray array = new MyArray();
        array.add(0);
        array.add(2);
        array.add(4);
        Integer expected = 2;
        Integer actual = array.find(1);
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void findIncorrectPositionShouldThrowException() throws Exception {
        MyArray array = new MyArray();
        try {
            array.find(10);
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
