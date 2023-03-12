package myLists;

public class MyLinkedList implements MyLists {

    private Node head;
    private Node tail;
    private int size = 0;

    public Integer find(int position) {
        if (position > size) {
            throw new IllegalArgumentException("element doesn't exist");
        } else {
            Integer element = 0;
            Node node = head;
            for (int i = 1; i <= position; i++) {
                element = node.currentElement;
                node = node.next;
            }
            return element;
        }
    }

    public void add(Integer obj) {
        Node node = new Node(obj, null);
        if (head == null) {
            head = node;
            tail = node;
            size++;
        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public Integer getHead() {
        return head.currentElement;
    }

    public Integer getTail() {
        return tail.currentElement;
    }

    public boolean remove(int position) {
        Node current = head;
        if (position > size) {
            throw new IllegalArgumentException("element doesn't exist");
        } else if (position == size) {
            for (int i = 1; i < position; i++) {
                current = current.next;
                if (i == position - 1) {
                    tail = current.next;
                }
            }
            size--;
            return true;
        } else if (position == 1) {
            head = head.next;
            size--;
            return true;
        } else {
            for (int i = 1; i < position; i++) {
                Node beforeRemoved = current;
                current = current.next;
                if (i == position - 1) {
                    beforeRemoved.next = current.next;
                }
            }
            size--;
            return true;
        }
    }

    public int getSize() {
        return size;
    }

    public void showList() {
        Node node = head;
        for (int i = 1; i <= size; i++) {
            System.out.print(node.currentElement + " -> ");
            node = node.next;
        }
    }
    public void sortUp() {
        for (int i = 1; i < size; i++) {
            Node first = head;
            for (int j = 1; j < size; j++) {
                Node second = first.next;
                if (first.currentElement > second.currentElement) {
                    Integer tempFirstInt = first.currentElement;
                    first.currentElement = second.currentElement;
                    second.currentElement = tempFirstInt;
                }
                first = first.next;
            }
        }
    }

    public void sortDown() {
        for (int i = 1; i < size; i++) {
            Node first = head;
            for (int j = 1; j < size; j++) {
                Node second = first.next;
                if (first.currentElement < second.currentElement) {
                    Integer tempFirstInt = first.currentElement;
                    first.currentElement = second.currentElement;
                    second.currentElement = tempFirstInt;
                }
                first = first.next;
            }
        }
    }


    static class Node {
        Integer currentElement;
        Node next;

        Node(Integer currentElement, Node next) {
            this.currentElement = currentElement;
            this.next = next;
        }
    }
}
