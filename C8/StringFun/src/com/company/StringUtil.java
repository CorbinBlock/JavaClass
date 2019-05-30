package com.company;

public class StringUtil
{
    String string;

    public String getString()
    {
        return string;
    }

    public static String getFirstChar(String string)
    {
        return string.substring(0, 1);
    }

    public int getLength(String string)
    {
        this.string = string;

        int firstChar2 = string.length();
        return firstChar2;
    }

    public static String getLastChar(String string)
    {
        int length = string.length();
        String lastChar1 = string.substring(length - 1, length);
        return lastChar1;
    }

    public static String getLastTwoCharacters(String string)
    {
        int length = string.length();
        String lastTwoChar1 = string.substring(length - 2, length);
        return lastTwoChar1;
    }

    public static String getFirstTwoCharacters(String string)
    {
        String lastTwoChar1 = string.substring(0, 2);
        return lastTwoChar1;
    }

    public static String getAllButFirstThreeCharacters(String string)
    {
        int length = string.length();
        String allButFirstThreeChar1 = string.substring(3, length);
        return allButFirstThreeChar1;
    }

    public static String getCharAtX(String string, int charPosition)
    {
        String allButFirstThreeChar1 = string.substring(charPosition, charPosition + 1);
        return allButFirstThreeChar1;
    }
}
