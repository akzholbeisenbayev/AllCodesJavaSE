package AlgorithmsAndDataStructures.Queue.ProjectNFactorial;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;


//Throw an IllegalArgumentException if the client calls enqueue() with a null argument.
//Throw a java.util.NoSuchElementException if the client calls either sample() or dequeue() when the randomized queue is empty.
//Throw a java.util.NoSuchElementException if the client calls the next() method in the iterator when there are no more items to return.
public class RandomizedQueue<Item> implements Iterable<Item> {
    @Override
    public void forEach(Consumer<? super Item> action) {

    }

    @Override
    public Spliterator<Item> spliterator() {
        return null;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }
    //    // construct an empty randomized queue
//    public RandomizedQueue()
//    // is the randomized queue empty?
//    public boolean isEmpty()
//    // return the number of items on the randomized queue
//    public int size()
//    // add the item
//    public void enqueue(Item item)
//    // remove and return a random item
//    public Item dequeue()
//    // return a random item (but do not remove it)
//    public Item sample()
//    // return an independent iterator over items in random order
//    public Iterator<Item> iterator()
//    // unit testing (required)
//    public static void main(String[] args)
}