package ExC_D_StrategyPattern;

import java.util.ArrayList;

public class BubbleSorter <E extends Number & Comparable<E>>  implements Sorter<E> {

    @Override
    public void sort(ArrayList<Item<E>> list) {
        // adapted from: https://stackabuse.com/bubble-sort-in-java/
        Item<E> temp;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < list.size()-1; i++) {
                if (list.get(i).getItem().compareTo(list.get(i + 1).getItem()) > 0) {
                    temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    sorted = false;
                }
            }
        }}
}
