package designpattern.observer;

public interface Subject {

    void registorObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
