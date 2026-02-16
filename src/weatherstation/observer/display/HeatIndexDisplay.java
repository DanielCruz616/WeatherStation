/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weatherstation.observer.display;
import java.lang.Math;
import weatherstation.observer.Observer;

public class HeatIndexDisplay implements Observer, Display{
    
    private float HI;
    
    @Override
    public void update(float t, float h, float pressure) {
        float s = -8.78469475556f 
                + 1.61139411f * t 
                + 2.33854883889f * h 
                + -0.14611605f * t*h 
                + -0.012308094f*(t*t)
                + -0.0164248277778f*(h*h)
                + 2.211732e-3f*(t*t)*h
                + 7.2546e-4f*t*(h*h)
                + -3.582e-6f*(t*t)*(h*h);
        HI = s;
        display();
    }

    @Override
    public void display() {
        System.out.println("[[Heat Index]]: "+HI);
    }
    
}
