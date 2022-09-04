package com.jap.sales;


import java.util.Comparator;

public class TimeOnSiteComparator implements Comparator<SalesRecord> {

    @Override
    public int compare(SalesRecord R1, SalesRecord R2) {
        if (R1.getTime_on_site() == R2.getTime_on_site()) {
            return 0;
        }
        if (R1.getTime_on_site() > R2.getTime_on_site()) {
            return -1;
        }
        return 1;
    }
}
