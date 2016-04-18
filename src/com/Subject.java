package com;

import com.Observer;

/**
 * Created by Connor on 4/17/16.
 */
public interface Subject {
    void addObserver(Observer Obs);

    void removeObserver(Observer Obs);

    void notifyObservers();
}
