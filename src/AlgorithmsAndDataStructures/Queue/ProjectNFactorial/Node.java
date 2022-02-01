package AlgorithmsAndDataStructures.Queue.ProjectNFactorial;

public class Node<E>
{
    E item;
    Node<E> next;
    Node<E> previous;

    Node(Node<E> prev, E element, Node<E> next) {
        this.item = element;
        this.next = next;
        this.previous = prev;
    }

}
