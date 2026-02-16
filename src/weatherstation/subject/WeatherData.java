/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weatherstation.subject;

import java.util.ArrayList;
import java.util.List;
import weatherstation.observer.Observer;

/**
 *
 * @author Estudiantes
 */
public class WeatherData implements Subject{
    private List<Observer> observers;
    public float temperature;
    public float humidity;
    public float pressure;
    
    public WeatherData(){
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer O) {
        observers.add(O);
    }

    @Override
    public void removeObserver(Observer O) {
        observers.remove(O);
    }

    @Override
    public void notifyObserver() {
        for (Observer o: observers){
            o.update(temperature, humidity, pressure);
        }
    }
    
    public void measurementsChange(float t,float h, float p){
        this.humidity = h;
        this.temperature = t;
        this.pressure = p;
        notifyObserver();
    }
}
