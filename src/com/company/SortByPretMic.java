package com.company;
import java.util.Comparator;
public class SortByPretMic implements Comparator<Produse> {
    @Override
    public int compare(Produse obiect1, Produse obiect2) {
        return (int) (obiect1.getPretVanzare() - obiect2.getPretVanzare());
    }
}