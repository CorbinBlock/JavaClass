package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue
{
    public void run()
    {
        Queue<String> myQueue = new LinkedList<>();

        myQueue.add("One");
        myQueue.add("Two");
        myQueue.add("Three");
        myQueue.add("Four");
        myQueue.add("Five");

        System.out.println(myQueue);

        myQueue.poll();
//removes first in queue FIFO.
        System.out.println(myQueue);

        System.out.println(myQueue.peek());
        System.out.println(myQueue);

        myQueue.remove();
        System.out.println(myQueue);

        myQueue.remove();
        System.out.println(myQueue);

        myQueue.remove();
        System.out.println(myQueue);

        myQueue.remove();
        System.out.println(myQueue);

        myQueue.poll();
        System.out.println(myQueue);

        myQueue.poll();
        System.out.println(myQueue);

        //.remove() does the same as .poll(), but poll() returns NULL when used on empty queue; .remove() throws an error.
//.peek() returns NULL with an empty queue as well.
        //myQueue.remove();             //cannot remove from empty queue.
        //System.out.println(myQueue);

    }
}
