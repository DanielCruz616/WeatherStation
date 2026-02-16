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
public class StatisticsDisplay implements Display, Observer{
    private float tempSum;
    private float humSum;
    private float pressSum;
    private float numReadings;

    // Constructor
    public StatisticsDisplay() {
        this.tempSum = 0.0f;
        this.humSum = 0.0f; 
        this.pressSum = 0.0f;
        this.numReadings = 0;
    }
    
    @Override
    public void display() {
        System.out.printf("[[Stats]] \nAverage Temperature: "+ (tempSum / numReadings)+"\n"
                + "Average Humidity: " + (humSum / numReadings)+"\n"
                        + "Average Pressure: " + (pressSum / numReadings));
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        humSum += humidity;
        pressSum += pressure;
        numReadings++;
        display();
    }
    
}
