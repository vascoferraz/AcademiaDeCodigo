package org.academiadecodigo.asynctomatics.producerconsumer;

import org.academiadecodigo.asynctomatics.producerconsumer.bqueue.BQueue;

/**
 * Consumer of integers from a blocking queue
 */
public class Consumer implements Runnable {

    private final BQueue<Integer> queue;
    private int elementNum;

    /**
     * @param queue      the blocking queue to consume elements from
     * @param elementNum the number of elements to consume
     */
    public Consumer(BQueue<Integer> queue, int elementNum) {
        this.queue = queue;
        this.elementNum = elementNum;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (this) {

                while (queue.getSize() == 0) {
                    try {
                        System.out.println("HERE Consumer");
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int val = queue.poll();

                System.out.println("Consumer " + this + "consumed-" + val);

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
