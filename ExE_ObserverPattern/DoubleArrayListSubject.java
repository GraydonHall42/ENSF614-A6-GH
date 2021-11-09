package ExE_ObserverPattern;

import java.text.DecimalFormat;
import java.util.ArrayList;

// this is our observable object (the subject)
public class DoubleArrayListSubject implements Subject{
    private ArrayList<Double> data;  // should be public or private? since we say it should be visible to the observers
    private ArrayList<Observer> observers;
    private DecimalFormat df = new DecimalFormat("0.00");

    public DoubleArrayListSubject() {
        data = new ArrayList<Double>();
        observers = new ArrayList<Observer>();
    }

    // add value v to data
    public void addData(double v){
        data.add(v);
        notifyObserver();
    }

    // set element i equal to value v
    public void setData(double v, int i){
        data.set(i, v);
        notifyObserver();
    }

    // poplulate arrayList data with values from arr
    public void populate(double [] arr){
        for (double v : arr) data.add(v);  // add each element of arr to our data arrayList
        notifyObserver();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
        o.update(data);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(int i=0; i<observers.size(); i++){
            Observer o = observers.get(i);
            o.update(data);
        }
    }

    public void display(){

        // if list is empty
        if(data.isEmpty()){
            System.out.println("Empty List ...");
            return;
        }


        String str = "";
        for(int i=0; i<data.size(); i++){
            str += df.format(data.get(i))  + ", ";
        }
        System.out.println(str);
    }
}
