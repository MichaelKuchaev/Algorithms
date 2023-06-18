package org.algorithm.homeWork;

public class HomeWork2 {
    Node head; // ссылка на начало нашего списка
    Node tail; // ссылка на конец нашего списка

    public void revertOne(Node currentNode, Node previousNode){ // односвязный список
        if (currentNode.next == null){
            head = currentNode;
        }
        else {
            revertOne(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
        previousNode.next = null;
    }

    public void revertTwo(){ // многосвязный список
        Node currentNode = head;
        while (currentNode != null){
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null){
                tail = currentNode;
            }
            if (next == null){
                head = currentNode;
            }
            currentNode = next;
        }
    }

    public class Node {
        int value; // значение ноды
        Node next; // ссылка на следующую ноду
        Node previous; // ссылка на предыдущую ноду
    }
}
