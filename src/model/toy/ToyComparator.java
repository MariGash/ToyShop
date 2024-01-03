package model.toy;

import java.util.Comparator;

import model.toylist.ToyItem;

public class ToyComparator <E extends ToyItem> implements Comparator <E> {

    @Override
    public int compare(E o1, E o2) {
        if (o1.getFrequency() < o2.getFrequency())
            return 1;
        if (o1.getFrequency() > o2.getFrequency())
            return -1;
        return 0;
    }

}