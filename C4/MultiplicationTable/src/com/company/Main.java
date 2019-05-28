package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int max = 6;

        System.out.println("   ");
        int columnHeaderNumber = 1;

        while (columnHeaderNumber <= max)
        {
            System.out.printf("%2d ",columnHeaderNumber);
            columnHeaderNumber++;
        }
        System.out.println();
        System.out.print(" ");
        columnHeaderNumber = 1;
        while (columnHeaderNumber <= max)
        {
            System.out.print("---");
            columnHeaderNumber++;
        }
        int rowNumber = 1;

        while (rowNumber <= max)
        {
            int columnNumber = 1;
            System.out.print(rowNumber + " |");

            while (columnNumber <= max)
            {
                System.out.printf("%2d ", rowNumber * columnNumber );
                columnNumber++;
            }
            System.out.println();
            rowNumber++;
        }
    }
}
