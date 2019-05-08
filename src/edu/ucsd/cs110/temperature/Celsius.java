package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature {
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float value = (float)(this.getValue()*(1.8)) + 32;
        return new Fahrenheit(value);
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " C";
    }
}
