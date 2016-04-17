/**
 * Created by Connor on 4/17/16.
 */

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

import java.util.ArrayList;

public class PostOffice implements Subject {

    private String Address;

    public String getAddress() {
        return Address;
    }

    private ArrayList<Observer> observers;

    public PostOffice(String address){
        super();
        this.Address = address;
        observers = new ArrayList<Observer>();
    }

    public void NewMail(){
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o){
        observers.remove(o);
    }

    @Override
    public void notifyObservers(){
        for (int i = 0;i<observers.size();i++){
            observers.get(i).update();
        }

    }
}
