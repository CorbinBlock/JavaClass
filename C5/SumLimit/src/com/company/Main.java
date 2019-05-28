package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public int sumLimit(int a, int b)
    {
        int sum = a = b;
        int answer = sum;

        String sumText = String.valueOf(sum);
        String aText = String.valueOf(a);

        int sumLength = sumText.length();
        int aLength = aText.length();

        if (sumLength > aLength)
        {
            answer = a;
        }

        return answer;
    }

}
