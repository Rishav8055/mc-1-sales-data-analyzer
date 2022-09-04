package com.jap.sales;


import java.util.Comparator;

public class AmountComparator implements Comparator<SalesRecord> {
    @Override
    public int compare(SalesRecord S1, SalesRecord S2) {
        if (S1.getAmount() == S2.getAmount()) {
            return 0;
        }
        if (S1.getAmount() > S2.getAmount()) {
            return -1;
        }
        return 1;
    }


}
