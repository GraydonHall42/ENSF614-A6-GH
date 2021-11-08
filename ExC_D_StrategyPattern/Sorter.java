package ExC_D_StrategyPattern;

import java.util.ArrayList;

public interface Sorter <E extends Number & Comparable<E>>{
    void sort(ArrayList<Item<E>> V);
}
