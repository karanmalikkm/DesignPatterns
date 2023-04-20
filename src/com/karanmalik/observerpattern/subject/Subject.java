package com.karanmalik.observerpattern.subject;

import com.karanmalik.observerpattern.observers.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
