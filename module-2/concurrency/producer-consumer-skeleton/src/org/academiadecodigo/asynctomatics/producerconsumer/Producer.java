package org.academiadecodigo.asynctomatics.producerconsumer;

import org.academiadecodigo.asynctomatics.producerconsumer.bqueue.BQueue;

/**
 * Produces and stores integers into a blocking queue
 */
public class Producer implements Runnable {

    private final BQueue<Integer> queue;
    private int elementNum;

    /**
     * @param queue      the blocking queue to add elements to
     * @param elementNum the number of elements to produce
     */
    public Producer(BQueue<Integer> queue, int elementNum) {
        this.queue = queue;
        this.elementNum = elementNum;
    }

    @Override
    public void run() {

        int counter = 0;

        while (elementNum > 0) {
            synchronized (this) {

                while (queue.getSize() == queue.getLimit()) {
                    try {
                        System.out.println("HERE Producer");
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Producer " + this + "produced-" + counter);

                queue.offer(counter++);

                notifyAll();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


