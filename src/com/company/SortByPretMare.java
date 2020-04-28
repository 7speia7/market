package com.company;
import java.util.Comparator;
public class SortByPretMare implements Comparator<Produse> {
    @Override
    public int compare(Produse obiect1, Produse obiect2) {
        return (int) (obiect2.getPretVanzare() - obiect1.getPretVanzare());
    }
}