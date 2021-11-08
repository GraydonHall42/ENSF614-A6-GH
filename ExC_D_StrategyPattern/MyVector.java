package ExC_D_StrategyPattern;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MyVector <E extends Number & Comparable<E>>{
    protected ArrayList<Item<E>> storageM;
    protected Sorter sorter;
    private static DecimalFormat df = new DecimalFormat("0.00");


    // set sorting strategy
    public void setSortStrategy(Sorter sorter) {
        this.sorter = sorter;
    }

    // constructor: alllocate memory for array with n elements
    public MyVector(int n){
        storageM = new ArrayList<>(n);
    }

    // constructor: makes storageM an exact copy of ArrayList arr
    public MyVector(ArrayList<Item<E>> arr) {
        this.storageM = arr;
    }

    // add item to storageM
    public void add(Item<E> value){
        storageM.add(value);
    }

    public void performSort(){
        sorter.sort(storageM);
    }

    public void display(){
        String str = "";
        for(int i=0; i<storageM.size(); i++){
            str += df.format(storageM.get(i).getItem())  + ", ";
        }
        System.out.println(str);
    }



}
