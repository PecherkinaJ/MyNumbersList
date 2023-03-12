import myLists.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(-10);
        linkedList.add(20);
        linkedList.add(-30);
        linkedList.add(40);
        linkedList.add(-50);
        linkedList.add(60);
//        System.out.println("head = " + linkedList.getHead());
//        System.out.println("tail = " + linkedList.getTail());

//        linkedList.showList();
//        System.out.println("position №2 = " + linkedList.find(2)); // 2
//        System.out.println(linkedList.find(5)); // IllegalArgumentException("element doesn't exist")

//        System.out.println("\nlist before remove:");
//        linkedList.showList();
//        System.out.println("\nsize = " + linkedList.getSize());
//        linkedList.remove(5);
//        System.out.println("\nlist AFTER remove:");
//        linkedList.showList();
//        System.out.println("\nsize = " + linkedList.getSize());

//        System.out.println(linkedList.find(2));

        System.out.println("-50 -> -30 -> -10 -> 20 -> 40 -> 60  should be: ");
        linkedList.sortUp();
        linkedList.showList();

        System.out.println("\n60 -> 40 -> 20 -> -10 -> -30 -> -50  should be: ");
        linkedList.sortDown();
        linkedList.showList();



        // ---------------------------------------------------------
//        MyArray array = new MyArray();
//        array.add(11);
//        array.add(5);
//        array.add(1);
//        array.add(100);
//        array.add(-100);
//        array.add(100);
//        array.add(-6);
//        array.add(6);
//        array.add(6);
//        System.out.println("array before: "+ Arrays.toString(array.showArray()));
//        System.out.println("Sort to biggest: " + Arrays.toString(array.sortUp()));
//        System.out.println("Sort to lowest:  " + Arrays.toString(array.sortDown()));

    }
}

