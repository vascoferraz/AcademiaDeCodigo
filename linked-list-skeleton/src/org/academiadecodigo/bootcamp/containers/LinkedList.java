package org.academiadecodigo.bootcamp.containers;

public class LinkedList {

    private Node head;
    private int length = 0;

    public LinkedList() {
        this.head = new Node(null);
    }

    public int size() {
        return length;
    }

    /**
     * Adds an element to the end of the list
     * @param data the element to add
     */
    public void add(Object data)  {

        Node node = new Node(data);
        Node iterator = head;
        while (iterator.getNext() != null){
            iterator = iterator.getNext();
        }
        iterator.setNext(node);
        length++;

    }

    /**
     * Obtains an element by index
     * @param index the index of the element
     * @return the element
     */
    public Object get(int index) {

        if (head.getNext() == null || index >= length){
            return null;
        }

        Node iterator = head.getNext();
        int counter = 0;

        while(counter < index) {

            iterator = iterator.getNext();
            counter++;
        }
        return iterator.getData();
        //throw new UnsupportedOperationException();
    }

    /**
     * Returns the index of the element in the list
     * @param data element to search for
     * @return the index of the element, or -1 if the list does not contain element
     */
    public int indexOf(Object data) {

            Node obj=head;
            for (int i = 0; i < length; i++) {
                obj = obj.getNext();
                if (obj.getData().equals(data)) {
                    return i;
                }
            }
        return -1;
        //throw new UnsupportedOperationException();
    }

    /**
     * Removes an element from the list
     * @param data the element to remove
     * @return true if element was removed
     */
    public boolean remove(Object data) {

        if (head.getNext() == null){
            return false;
        }

        Node iterator = head;

        while(iterator.getNext() != null){

            if (iterator.getNext().getData().equals(data)){
                iterator.setNext(iterator.getNext().getNext());
                length--;
                return true;
            }

            iterator = iterator.getNext();
        }

        return false;

        //throw new UnsupportedOperationException();

    }

    private class Node {

        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            next = null;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
