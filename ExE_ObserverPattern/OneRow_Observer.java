package ExE_ObserverPattern;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class OneRow_Observer implements Observer{
    private ArrayList<Double> data;
    Subject subject;
    private DecimalFormat df = new DecimalFormat("0.0");

    public OneRow_Observer(Subject subject) {
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
        String str = "\nNotification to One-Row Observer: Data Changed:\n";
        for(int i =0; i<data.size(); i++){
            str += df.format(data.get(i))  + " ";
        }
        System.out.println(str);

    }
}
