package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

    private List<Observer> observerList = new ArrayList<>();
    private String productName;
    private String productType;
    private String avalability;

    public Product( String productName, String productType, String avalability) {
        this.productName = productName;
        this.productType = productType;
        this.avalability = avalability;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getAvalability() {
        return avalability;
    }

    public void setAvalability(String avalability) {
        this.avalability = avalability;
    }

    @Override
    public void registorObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observerList){
            observer.update(this.avalability);
        }
    }
}
