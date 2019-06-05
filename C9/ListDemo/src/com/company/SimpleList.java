package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleList
{

    public void demo()
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> simpleList = new ArrayList<>();
        int listCounter = 0;
        int index = 0;
//could have done list.add("Color");
        do
        {
            System.out.println("Please enter a color: ");
            String newColor = scanner.next();
            simpleList.add(newColor);
            listCounter++;
        } while (listCounter < 5);

        //printing

        while (index < listCounter)
        {
        System.out.println(simpleList.get(index));
        index++;
    }


        for (int i = 0; i < simpleList.size(); i++)
        {
            System.out.println(simpleList.get(i));
        }

        for (String item : simpleList)   //this is a for each loop - preferred method.
        {
            System.out.println(item);
        }


    }
}


