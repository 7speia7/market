package com.company;
import java.util.Comparator;
public class SortByNume implements Comparator<Produse> {
    @Override
    public int compare(Produse obiect1, Produse obiect2) {
        return obiect1.getNume().compareTo(obiect2.getNume());
    }
}