package com.company;

/**
 * Created by andrewryan on 3/2/16.
 */
public class CardDeck<T> implements ListInterface {

    private Node head;
    private Node tail;
    private int size;
    private int maxCapacity;

    CardDeck() {

        this.size = 0;
        maxCapacity = 108; // amount of cards in UNO deck

    }

    CardDeck(int capacity) {

        this.maxCapacity = capacity;

    }

    private class Node {

        T data;
        Node previous;
        Node next;

        Node(T element, Node previous, Node next){

            this.data = element;
            this.previous = previous;
            this.next = next;

        }

        public T getData() {

            return data;

        }

        public Node getPrevious() {

            return previous;

        }

        public Node getNext() {

            return next;

        }

        public void setData(T data) {

            this.data = data;

        }

        public void setPrevious(Node previous) {

            this.previous = previous;

        }

        public void setNext(Node next) {

            this.next = next;

        }
    }

    public boolean addLast(T newData) { // Adds element to the bottom of the list

        Node temporaryNode = new Node(newData, null, tail);

        if (isEmpty()) {

            head = temporaryNode;

        }

        if (tail != null) {

            try {

                tail.next = temporaryNode;

            } catch (Exception e) {

                return false;

            }

        }

        tail = temporaryNode;

        if (head == null) {

            try {

                head = temporaryNode;

            } catch (Exception e) {

                return false;

            }

        }

        size++;

        return true;

    }

    @Override
    public boolean add(Object newEntry) { // Adds element to the front of the list

        Node temporaryNode = new Node((T)newEntry, head, null);

        if (isEmpty()) {

            head = temporaryNode;

        }

        if (head != null) {

            try {

                head.previous = temporaryNode;
                temporaryNode.setNext(head);

            } catch (Exception e) {

                return false;

            }

        }

        head = temporaryNode;

        if (tail == null) {

            try {

                tail = temporaryNode;
                temporaryNode.setPrevious(tail);

            } catch (Exception e) {

                return false;

            }

        }

        size++;

        return true;

    }

    @Override
    public boolean add(int newPosition, Object newEntry) { // Adds the given element casted as type T to the given position from the arguments

        Node newNode = new Node((T)newEntry, head, null);

        if (newPosition == 1) {

            add(newEntry);
            return true;

        }

        Node currentNode = head;

        for (int i = 2; i <= size; i++) {

            if (i == newPosition) {

                Node temp = currentNode.getNext();
                currentNode.setNext(newNode);
                newNode.setPrevious(currentNode);
                newNode.setNext(temp);
                temp.setPrevious(newNode);

                return true;

            }

            currentNode = currentNode.getNext();

        }

        size++ ;

        return false;

    }

    @Override
    public Object remove(int givenPosition) { // Removes an element at a given position

        if (givenPosition == 1) {

            if (size == 1) {

                head = null;
                tail = null;
                size = 0;
                return null;

            }

            Node removed = head;

            head = head.getNext();
            //head.setPrevious(null);
            size--;
            return removed;
        }

        if (givenPosition == size) {

            tail = tail.getPrevious();
            tail.setNext(null);
            size-- ;
        }

        Node currentNode = head.getNext();

        for (int i = 2; i <= size; i++) {

            if (i == givenPosition) {

                Node previous = currentNode.getPrevious();
                Node next = currentNode.getNext();

                previous.setNext(next);
                next.setPrevious(previous);
                size--;
                return null;
            }

            currentNode = currentNode.getNext();
        }

        return null;
    }

    @Override
    public void clear() { // Clears the Deck of all Nodes

        Node currentNode = tail.getPrevious();

        tail.setData(null);

        for (int i = size -1; i >= 0; i--) {

            if (currentNode == head) {

                head.setData(null);
                head.setPrevious(null);

                size--;

            }

            currentNode.setNext(null);
            currentNode.setData(null);

            size--;

        }

        currentNode = currentNode.getPrevious();

    }


    @Override
    public boolean replace(int givenPosition, Object newEntry) { // Replaces a Node at a given position with a given Object as the data of the Node

        Node newNode = new Node((T)newEntry, null, null);

        if (givenPosition == 1) {

            System.out.println("Replaced");
            head = newNode;
            return true;

        }

        if (givenPosition == size) {

            System.out.println("Replaced");
            tail = newNode;
            return true;
        }

        Node currentNode = head.getNext();

        for (int i = 2; i < size; i++) {

            //System.out.println("Attempting to replace");

            if (i == givenPosition) {

//                newNode.setPrevious(currentNode.getPrevious());
//                newNode.setNext(currentNode.getNext());
                System.out.println("Replaced");
                currentNode.setData((T)newEntry);

                return true;
            }

            currentNode = currentNode.getNext();

        }

        return false;
    }

    @Override
    public Object getEntry(int givenPosition) { // Gets Node at specified position

        Node currentNode;

        if (givenPosition == 1) {

            return head.data;

        }

        if (givenPosition == size) {

            return tail.data;
        }

        currentNode = head.getNext();

        for (int i = 2; i <= size; i++) {

            if (i == givenPosition) {

                return currentNode.data;

            }

            currentNode = currentNode.getNext();

        }

        return null;

    }

    @Override
    public boolean contains(Object anEntry) { // Checks to see if the Deck contains a specific Node

        Node currentNode;

        if (head == (T)anEntry) {

            return true;

        }

        if (tail == (T)anEntry) {

            return true;
        }

        currentNode = head.getNext();

        for (int i = 2; i <= size; i++) {

            if (currentNode == (T)anEntry) {

                return true;
            }

            currentNode = currentNode.getNext();

        }

        return false;
    }

    @Override
    public int getLength() { // Returns the length of the list

        return size;
    }

    @Override
    public boolean isEmpty() { // Returns a boolean depending on if the list is empty

        return size == 0;
    }

    @Override
    public boolean isFull() { // Returns a boolean depending on if the size is equal to the max capacity

        return size == maxCapacity;
    }

    @Override
    public void display() { // Displays all data contained in Node objects using an output stream

        System.out.println("\nDoubly Linked List = ");

        if (size == 0) {

            System.out.println("List is Empty\n");
            return;

        }

        if (head.getNext() == null) {

            System.out.println(head.getData());
            return;

        }

        Node currentNode = head;

        System.out.println(head.getData() + " <-> ");

        currentNode = head.getNext();

        while (currentNode.getNext() != null) {

            System.out.println(currentNode.getData()+ " <-> ");
            currentNode = currentNode.getNext();
        }

        System.out.println(currentNode.getData()+ "\n");

    }
}
