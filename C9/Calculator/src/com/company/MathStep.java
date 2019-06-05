package com.company;

public class MathStep
{
    private Calculator calculator;
    private long value;

    public MathStep(Calculator calculator, long value)
    {
        this.calculator = calculator;
        this.value = value;
    }

    public Calculator getCalculator()
    {
        return calculator;
    }

    public long getValue()
    {
        return value;
    }
}
