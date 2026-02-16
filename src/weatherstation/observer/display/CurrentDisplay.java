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
public class CurrentDisplay implements Display, Observer{
    private float temperature;
    private float humidity;
    private float pressure;
    
    @Override
    public void display() {
        System.out.println("""
                           [[Current condition]]: 
                           Temperature: """+temperature+"\n"
                        + "Humidity: "+humidity+"\n"
                                + "Pressure: "+pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
        display();
    }
    
}
