/**
 * Created by Connor on 4/17/16.
 */
public interface Subject {
    void addObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
