import myLists.MyArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArray array = new MyArray();
        array.add(11);
        array.add(5);
        array.add(1);
        array.add(100);
        array.add(-100);
        array.add(100);
        array.add(-6);
        array.add(6);
        array.add(6);
        System.out.println("array before: "+ Arrays.toString(array.showArray()));
        System.out.println("Sort to biggest: " + Arrays.toString(array.sortUp()));
        System.out.println("Sort to lowest: " + Arrays.toString(array.sortDown()));
    }
}
