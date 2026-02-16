/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weatherstation.subject;

import weatherstation.observer.Observer;

public interface Subject {
    
    public void registerObserver(Observer O);
    
    public void removeObserver(Observer O);
    
    public void notifyObserver();
    
}
