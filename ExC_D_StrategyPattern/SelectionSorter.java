package ExC_D_StrategyPattern;

import java.util.ArrayList;

public class SelectionSorter <E extends Number & Comparable<E>>  implements Sorter<E> {

    @Override
    public void sort(ArrayList<Item<E>> arr) {
        // adapted from: https://stackoverflow.com/questions/41955427/selection-sort-using-arraylist
        for (int i = 0; i < arr.size(); i++) {
            // find position of smallest num between (i + 1)th element and last element
            int pos = i;
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j).getItem().compareTo(arr.get(pos).getItem()) < 0)
                    pos = j;
            }
            // Swap min (smallest num) to current position on array
            Item<E> min = arr.get(pos);
            arr.set(pos, arr.get(i));
            arr.set(i, min);
        }
    }
}
