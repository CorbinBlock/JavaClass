package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(response('R' ));
        System.out.println(response('Y' ));
        System.out.println(response('Q' ));
        System.out.println(nextColor('Y' ));
        System.out.println(nextColor('R' ));
        System.out.println(nextColor('Z' ));


    }


    private static char response(char color)
    {
        if (color == 'R' )
        {
            char response = 'S';
            return response;
        }
        else if (color == 'Y' )
        {
            char response = 'C';
            return response;
        }
        else if (color == 'G' )
        {
            char response = 'G';
            return response;
        }
        else
        {
            char response = 'E';
            return response;
        }

    }

    private static char nextColor(char color)
    {
        if (color == 'R' )
        {
            char response = 'G';
            return response;
        }
        else if (color == 'G' )
        {
            char response = 'Y';
            return response;
        }
        else if (color == 'Y' )
        {
            char response = 'R';
            return response;
        }
        else
        {
            char response = 'E';
            return response;
        }
    }
}


