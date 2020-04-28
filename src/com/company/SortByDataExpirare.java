package com.company;
import java.util.Comparator;
public class SortByDataExpirare implements Comparator<Produse> {
    @Override
    public int compare(Produse obiect1, Produse obiect2) {
        return obiect2.getDataExpirare().compareTo(obiect1.getDataExpirare());
    }
}