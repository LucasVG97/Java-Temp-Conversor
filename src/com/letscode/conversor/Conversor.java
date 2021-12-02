package com.letscode.conversor;
import java.util.Scanner;


public class Conversor {
    public static void main (String[] args){
        Scanner celsiusScan = new Scanner(System.in);
        System.out.print("Insert the Celsius Temperature: ");
        float celsiusTemperature = celsiusScan.nextFloat();

        final float CELSIUS_TO_FAHRENHEIT = (celsiusTemperature * 1.8f) + 32;
        final float CELSIUS_TO_KELVIN = celsiusTemperature + 273.15f;
        final float CELSIUS_TO_REAUMUR = celsiusTemperature * 0.8f;
        final float CELSIUS_TO_RANKINE = (celsiusTemperature * 1.8f) + 461;

        if(celsiusTemperature <= 15) {
            System.out.printf("It's so cold, you should put on a jacket. This temperature is equivalent to: %n" +
                    "%.2f Fahrenheit(F) %n%.2f Kelvin(K) %n%.2f Réaumur(Re) %n%.2f Rankine(Ra)%n",
                    CELSIUS_TO_FAHRENHEIT, CELSIUS_TO_KELVIN, CELSIUS_TO_REAUMUR, CELSIUS_TO_RANKINE);
        }
        else if(celsiusTemperature > 15 && celsiusTemperature < 30  ){
            System.out.printf("It's getting hot. This temperature is equivalent to: %n%.2fFahrenheit(F) %n%.2f " +
                            "Kelvin(K) %n%.2f Réaumur(Re) %n%.2f Rankine(Ra) %n",
                    CELSIUS_TO_FAHRENHEIT, CELSIUS_TO_KELVIN, CELSIUS_TO_REAUMUR, CELSIUS_TO_RANKINE);
        }
        else{
            System.out.printf("It's awesome, drink a beer, have some ice cream, go to the beach. This temperature is " +
                            "equivalent to: %n%.2f Fahrenheit(F) %n%.2f Kelvin(K) %n%.2f Réaumur(Re) %n%.2f" +
                            " Rankine(Ra) %n",
                    CELSIUS_TO_FAHRENHEIT, CELSIUS_TO_KELVIN, CELSIUS_TO_REAUMUR, CELSIUS_TO_RANKINE);

        }
    }
}
