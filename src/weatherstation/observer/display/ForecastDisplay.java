/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weatherstation.observer.display;

import weatherstation.observer.Observer;

/**
 *
 * @author Estudiantes
 */
public class ForecastDisplay implements Display, Observer{
    private float lastPressure;
    private String forecastText;

    public ForecastDisplay() {
        this.lastPressure = 1013.25f;
    }
    
    @Override
    public void display() {
        System.out.println("[[Forecast]]: "+forecastText);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        
        if (pressure > lastPressure) {
            forecastText = "Improving: Weather is stabilizing";
        } else if (pressure == lastPressure) {
            forecastText = "No Changes: More of the same";
        } else if (pressure < lastPressure) {
            forecastText = "Warning: Watch out for cooler, rainy weather";
        }

        this.lastPressure = pressure;
        display();
    }
    
}