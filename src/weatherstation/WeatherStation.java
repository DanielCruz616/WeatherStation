/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package weatherstation;

import weatherstation.observer.display.*;
import weatherstation.subject.WeatherData;

/**
 *
 * @author Estudiantes
 */
public class WeatherStation {
    public static void main(String[] args) {
        
        WeatherData wede = new WeatherData();
        CurrentDisplay current = new CurrentDisplay();
        ForecastDisplay forecast = new ForecastDisplay();
        HeatIndexDisplay index = new HeatIndexDisplay();
        StatisticsDisplay statistics = new StatisticsDisplay();
        
        wede.registerObserver(current);
        wede.registerObserver(forecast);
        wede.registerObserver(index);
        wede.registerObserver(statistics);
        
        wede.measurementsChange(80, 70, 60.5f);
        wede.measurementsChange(50, 60, 70.5f);
        wede.measurementsChange(60, 30, 50.5f);
    }
    
}
