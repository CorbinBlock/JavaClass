package com.company;

import java.util.ArrayList;

public class ListDemo
{
    public static void executeList()
    {
        ArrayList<String> simpleList = new ArrayList<>();
        simpleList.add("Recliner");
        simpleList.add("Sofa");
        simpleList.add("Coffee-table");
        simpleList.add("Full-StackAmplifier");
        simpleList.add(0, "Bicycle");
        simpleList.add(2, "Barstool");
        simpleList.remove(simpleList.size() - 1);
        simpleList.remove(0);
        simpleList.remove(1);

        printList(simpleList);
    }

    private static void printList(ArrayList simpleList)
    {
        int index = 0;
        while (index < simpleList.size() - 1)
        {
            System.out.print(simpleList.get(index) + ":");
            index++;
        }
        System.out.print(simpleList.get(index));
    }

}
