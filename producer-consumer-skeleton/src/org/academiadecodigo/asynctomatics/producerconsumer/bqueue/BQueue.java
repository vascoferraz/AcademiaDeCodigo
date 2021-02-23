package org.academiadecodigo.asynctomatics.producerconsumer.bqueue;

import java.util.PriorityQueue;

/**
 * Blocking Queue
 * @param <T> the type of elements stored by this queue
 */
public class BQueue<T> {

    PriorityQueue<T> queue = new PriorityQueue<>();
    int limit;

    /**
     * Constructs a new queue with a maximum size
     * @param limit the queue size
     */
    public BQueue(int limit) {

        this.limit = limit;
        //throw new UnsupportedOperationException();

    }

    /**
     * Inserts the specified element into the queue
     * Blocking operation if the queue is full
     * @param data the data to add to the queue
     */
    public void offer(T data) {
        synchronized (this) {
            queue.offer(data);
        }
        //throw new UnsupportedOperationException();
    }

    /**
     * Retrieves and removes data from the head of the queue
     * Blocking operation if the queue is empty
     * @return the data from the head of the queue
     */
    public T poll() {
        synchronized (this) {
            return queue.poll();
        }
        //throw new UnsupportedOperationException();
    }


    /**
     * Gets the number of elements in the queue
     * @return the number of elements
     */
    public int getSize() {
        synchronized (this) {
            System.out.println("Size :" + queue.size());
            return queue.size();
        }
        //throw new UnsupportedOperationException();
    }

    /**
     * Gets the maximum number of elements that can be present in the queue
     * @return the maximum number of elements
     */
    public int getLimit() {
        System.out.println("Limit: " + limit);
        return limit;
        //throw new UnsupportedOperationException();

    }

}
