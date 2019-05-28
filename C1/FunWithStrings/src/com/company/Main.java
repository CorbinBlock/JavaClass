package com.company;

import java.sql.SQLOutput;

public class Main
{

    public static void main(String[] args)
    {
	String words = "hellothengoodbye";
        System.out.println(words);
        System.out.println(words.length());

        String word = words.substring(0,5);
        System.out.println(word);

        System.out.println(words.equals(word));
        System.out.println(words.equals("hello"));

    }
}
