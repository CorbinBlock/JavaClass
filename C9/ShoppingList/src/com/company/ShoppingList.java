package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShoppingList
{
    boolean keepShopping = true;
    private ArrayList<String> shoppingList = new ArrayList<>(); //remember to make these private

    public void run()
    {
        Scanner input = new Scanner(System.in); //System.in is the default input for our device, this could be outside file
        do
        {
            {
                System.out.println("How do you want to edit the shopping list?");
                String command = input.next().toUpperCase();

                switch (command)
                {
                    case "ADD":
                    case "A":
                        String listItem = input.next();
                        shoppingList.add(listItem);
                        break;
                    case "REMOVE":
                    case "R":
                    case "SUBTRACT":
                    case "S":
                        listItem = input.next();
                        shoppingList.remove(listItem);
                        break;
                    case "CLEAR":
                    case "C":
                        shoppingList.clear();
                        break;
                    case "EXIT":
                    case "E":
                        keepShopping = false;
                        break;
                    case "PRINT":
                    case "P":
                        printList();
                        break;
                    case "SORT":
                        Collections.sort(shoppingList);
                        break;
                    case "FIND":            //silver: find item in the array.
                    case "F":
                        listItem = input.next();

                    default:
                        System.out.println("Try that command again: ");
                }
            }
        } while (keepShopping);
    }

    private void printList()
    {
        System.out.println("Shopping List: ");
        for (String command : shoppingList)
        {
            System.out.println(command);
        }
    }


}
