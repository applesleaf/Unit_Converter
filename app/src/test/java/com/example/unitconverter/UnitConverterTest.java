package com.example.unitconverter;

import org.junit.Test;
import static org.junit.Assert.*;

public class UnitConverterTest {

    private static final double DELTA = 0.01;

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, UnitConverter.celsiusToFahrenheit(0), DELTA);
        assertEquals(212.0, UnitConverter.celsiusToFahrenheit(100), DELTA);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, UnitConverter.fahrenheitToCelsius(32), DELTA);
        assertEquals(100.0, UnitConverter.fahrenheitToCelsius(212), DELTA);
    }
}
