package com.example.demo.model;
public class stats {
    private double Count;
    private double Average;
    private double Min;
    private double Max;
    private double Sum;

    public stats(double count, double average, double min, double max, double sum) {
        Count = count;
        Average = average;
        Min = min;
        Max = max;
        Sum = sum;
    }
    
    public double getCount() {
        return Count;
    }
    public void setCount(double count) {
        Count = count;
    }
    public double getAverage() {
        return Average;
    }
    public void setAverage(double average) {
        Average = average;
    }
    public double getMin() {
        return Min;
    }
    public void setMin(double min) {
        Min = min;
    }
    public double getMax() {
        return Max;
    }
    public void setMax(double max) {
        Max = max;
    }
    public double getSum() {
        return Sum;
    }
    public void setSum(double sum) {
        Sum = sum;
    }

    
}