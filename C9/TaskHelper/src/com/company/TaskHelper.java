package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TaskHelper
{
    public void run()
    {
        Queue<String> myQueue = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        do
        {

            System.out.println("Task Manager: What is your command?");
            String command = input.next().toUpperCase();

            switch (command)
            {
                case "ADD":
                case "A":
                {
                    addTask(myQueue);       //calling our method.
                    break;
                }
                case "PEEK":
                case "P":

                {
                    peek(myQueue);
                    break;
                }
                case "REMOVE":
                case "R":
                {
                    remove(myQueue);
                    break;

                }
                case "HOWMANY":
                case "HM":
                case "H":
                {
                    howMany(myQueue);
                    break;

                }
                case "LIST":
                case "L":
                {
                    list(myQueue);
                    break;

                }
                case "WAIT":
                case "W":
                {
                    wait(myQueue);
                    break;

                }
                case "CHECK":
                case "C":
                {

                    check(myQueue);
                    break;

                }
                case "FLEE":
                case "F":
                {
                    flee(myQueue);
                    break;

                }
                case "EXIT":
                case "E":
                {
                    isRunning = false;
                }
                default:

            }
        } while (isRunning);


    }

    public void addTask(Queue myQueue)
    {
        System.out.println("Task Manager: What task shall I add?");
        Scanner input = new Scanner(System.in);
        String command = input.nextLine();
        myQueue.add(command);
    }

    public void peek(Queue myQueue)
    {
        System.out.println("Peeking at first object in queue: " + myQueue.peek());
    }

    public void remove(Queue myQueue)
    {
        System.out.println("Removing first item from queue.");
        System.out.println("Original queue: " + myQueue);
        System.out.println("Removing: " + myQueue.remove());
        System.out.println("New queue: " + myQueue);

    }

    public void howMany(Queue myQueue)
    {
        System.out.println("Size of the list is: " + myQueue.size());
    }

    public void list(Queue myQueue)
    {
        System.out.println("All current tasks: " + myQueue);
    }

    public void flee(Queue myQueue)
    {
        myQueue.clear();
        System.out.println("Task Helper is empty: " + myQueue.isEmpty());
    }

    public void wait(Queue myQueue)
    {
        Object wait = myQueue.peek();
        String waitString = (String) wait;
        System.out.println(waitString + " moved to end of list.");
        myQueue.add(waitString);
        myQueue.remove();
        System.out.println("New list: " + myQueue);
    }

    public void check(Queue myQueue)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Task Checker: What task shall I verify as new to list?");
        String command2 = input.nextLine();
        if (myQueue.contains(command2))
        {
            System.out.println("Fortunately, you already know about that one.");
        }
        else
        {
            System.out.println("Sadly, that task is not on the list.");
        }
    }

}
