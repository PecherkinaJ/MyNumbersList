package TestArray;

import myLists.MyArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRemove {

    @Test
    public void removeCorrectPositionShouldGiveCorrectElement(){
        MyArray array = new MyArray();
        array.add(0);
        array.add(2);
        array.add(4);
        Integer[] expected = {0, 4, null, null, null, null, null, null, null, null};
        array.remove(1);
        Integer [] actual = array.getArray();
        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void removeNegativePositionShouldGiveThrowException() throws Exception {
        MyArray array = new MyArray();
        try {
            array.remove(-30);
        } catch (Exception e) {
            throw new Exception();
        }
    }

    @Test(expected = Exception.class)
    public void removeIncorrectPositionShouldThrowException() throws Exception {
        MyArray array = new MyArray();
        try {
            array.remove(10);
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
