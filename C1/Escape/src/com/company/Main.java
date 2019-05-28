package com.company;

public class Main
{

    public static void main(String[] args)
    {
        String header = "\n\tNew York 3-Day Forecast:\n";
        header += "\n\tDay\t\tHigh\tLow\tConditions\n";
        header += "\t---\t\t----\t---\t----------\n";
        String forecast = "\tSunday\t68F\t\t48F\tSunny\n";
        forecast += "\tTuesday\t71F\t\t50F\tCloudy\n";
        System.out.println(header + forecast);
    }
}
