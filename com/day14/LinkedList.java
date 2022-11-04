package com.day14;

public class LinkedList<T> {
   // public class LinkedList<T> {
        Node<T> head;

        /**
         * Method for Appending the specified element to the end of this list.
         *
         * @param value
         */
        public void add(T value) {
            Node<T> newNode = new Node<T>();
            newNode.data = value;
            newNode.next = null;
            if (head == null) {
                head = newNode;
            } else {
                Node<T> last = head;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = newNode;
            }
        }

        /**
         * Method for printing the data inside the linkedlist.
         */
        public void show() {
            Node<T> node = head;
            while (node.next != null) {
                System.out.println(node.data);
                node = node.next;
            }
            System.out.println(node.data);
        }
    }


