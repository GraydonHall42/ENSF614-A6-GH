package ExC_D_StrategyPattern;

import java.util.ArrayList;

public class InsertionSorter <E extends Number & Comparable<E>>  implements Sorter<E> {

    @Override
    public void sort(ArrayList<Item<E>> list) {
        // adapted from: https://stackabuse.com/insertion-sort-in-java/
        for (int j = 1; j < list.size(); j++) {
            Item<E> current = list.get(j);
            int i = j-1;
            while ((i > -1) && ((list.get(i).getItem().compareTo(current.getItem())) == 1)) {
                list.set(i+1, list.get(i));
                i--;
            }
            list.set(i+1, current);
        }

    }
}