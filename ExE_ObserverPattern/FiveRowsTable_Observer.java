package ExE_ObserverPattern;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class FiveRowsTable_Observer implements Observer{
    private ArrayList<Double> data;
    Subject subject;
    private DecimalFormat df = new DecimalFormat("0.0");

    public FiveRowsTable_Observer(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }

    @Override
    public void update(ArrayList<Double> d) {
        this.data = d;
        display();
    }

    @Override
    public void display() {
        System.out.println("\nNotification to Five-Rows Table Observer: Data Changed:");
        int num_cols = data.size() / 5 + 1;
        Double[][] arr = new Double[5][num_cols];
        int row =0;
        int col=0;
        int counter = 0;

        while(counter<data.size()){
            while(row < 5 && counter<data.size()){
                arr[row][col] = data.get(counter);
                row++;
                counter++;
            }
            row = 0;
            col++;
        }

        String row_string = "";
        for(int i=0; i<5; i++){
            for(int j=0; j<num_cols; j++){
                if(arr[i][j] != null){
                    row_string += arr[i][j] + " ";
                }
            }
            row_string += "\n";
        }
        System.out.println(row_string);







    }
}
