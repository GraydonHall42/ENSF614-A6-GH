package ExE_ObserverPattern;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ThreeColumnTable_Observer implements Observer{
    private ArrayList<Double> data;
    Subject subject;
    private DecimalFormat df = new DecimalFormat("0.0");

    public ThreeColumnTable_Observer(Subject subject) {
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
        String str = "\nNotification to Three-Column Table Observer: Data Changed:\n";
        var rows = new ArrayList<String>();
        String row = "";
        int i = 0;
        var dataTemp = (ArrayList<Double>)data.clone();

        while (!dataTemp.isEmpty()) {
            while (i < 3 & !dataTemp.isEmpty()) {
                row += df.format(dataTemp.remove(0)) + " ";
                i++;
            }
            str += row + "\n";
            i =0;
            row = "";
        }
        System.out.println(str);
    }
}
