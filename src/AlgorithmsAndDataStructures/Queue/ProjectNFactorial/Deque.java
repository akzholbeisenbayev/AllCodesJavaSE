package AlgorithmsAndDataStructures.Queue.ProjectNFactorial;


import java.util.Iterator;
import java.util.LinkedList;

//Throw an IllegalArgumentException if the client calls either addFirst() or addLast() with a null argument.
//Throw a java.util.NoSuchElementException if the client calls either removeFirst() or removeLast when the deque is empty.
//Throw a java.util.NoSuchElementException if the client calls the next() method in the iterator when there are no more items to return.
public class Deque<Item> implements Iterable<Item> {
    transient int size = 0;

    LinkedList<Item> list;
    Node node;
    Node first;
    Node last;

    int modCount;

    private Item item2;

    public Deque(){}


    public boolean isEmpty() {
        return false;
    }

    public int size(){
        return 0;
    }


    public void addFirst(Item item) {
        Node f = node.previous;
        Node l = node.next;

        Node<Item> newNode = new Node<Item>(null, item, f);

        this.first = newNode;

        if (f == null)
            this.last = newNode;
        else
            l = newNode;
        size++;
        modCount++;
    }

    public void addLast(Item item)
    {

    }
    // remove and return the item from the front
    public Item removeFirst(){
        return item2;
    }
    // remove and return the item from the back
    public Item removeLast(){
        return item2;
    }
    // return an iterator over items in order from front to back
    public Iterator<Item> iterator()
    {
        return (Iterator<Item>) item2;
    }
    // unit testing (required)


}