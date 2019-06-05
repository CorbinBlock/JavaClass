package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerCalculator
{
    private long answer = 0;
    private ArrayList<MathStep> history = new ArrayList<>();

    public void run()
    {
        Scanner input = new Scanner(System.in);

        boolean keepRunning = true;

        do
        {
            String action = input.next().toUpperCase();

            switch (action)
            {
                case "ADD":
                case "A":
                {
                    long value = Long.parseLong(input.next());
                    add(value);
                    break;
                }
                case "SUBTRACT":
                case "S":
                {
                    long value = Long.parseLong(input.next());
                    subtract(value);
                    break;
                }
                case "CLEAR":
                case "C":
                {
                    clear();
                    break;
                }
                case "EXIT":
                case "E":
                {
                    keepRunning = false;
                    break;
                }
                case "HISTORY":
                case "H":
                {
                    printHistory();
                }
                default:
            }

            System.out.println("Answer: " + answer);
        }
        while (keepRunning);
    }

    private void add(long value)
    {
        answer += value;
        MathStep mathStep = new MathStep(Calculator.ADD, value);
        history.add(mathStep);
    }

    private void subtract(long value)
    {
        answer -= value;
        MathStep mathStep = new MathStep(Calculator.SUBTRACT, value);
        history.add(mathStep);
    }

    private void clear()
    {
        answer = 0;
        MathStep mathStep = new MathStep(Calculator.CLEAR, answer);
        history.add(mathStep);
    }

    private void printHistory()
    {
        for (MathStep mathStep : history)
        {
            System.out.println(mathStep.getCalculator() + " " + mathStep.getValue());
        }
    }

}