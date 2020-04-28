package com.company;

import oracle.jrockit.jfr.ProducerDescriptor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class ProdusManager {
    public void add(ArrayList produsList, String nume, double pretAchizitie, double pretVanzare, LocalDate data,String descriere) {
        Produse produs = new Produse();
        produs.setNume(nume);
        produs.setPretAchizitie(pretAchizitie);
        produs.setPretVanzare(pretVanzare);
        produs.setDataExpirare(data);
        produs.setDescrierea(descriere);
        produsList.add(produs);
    }
    public void view(ArrayList produsList) {
        System.out.println("| Nr |      Nume      |      pretAchizitie      |      pretVanzare      |      data      |      descriere      |");
        System.out.println("|---------------------------------------------------------------------------------------------------|");
        for (int i = 0;i< produsList.size();i++){
            Produse produs = (Produse) produsList.get(i);
            String nume = produs.getNume();
            double pretAchizitie = produs.getPretAchizitie();
            double pretVanzare = produs.getPretVanzare();
            LocalDate data = produs.getDataExpirare();
            String des = produs.getDescrierea();
            DateTimeFormatter dataFormatata = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String stringData = data.format(dataFormatata);
            System.out.println("| " + i + " | " + nume + " | "+ pretAchizitie+" | "+ pretVanzare + " | "+ stringData + " |"+ des + " |");
            System.out.println("|---------------------------------------------------------------------------------------------------|");
        }
    }
    public void delete(ArrayList produsList,int id){
        produsList.remove(id);
    }
    public void sortListByNume(ArrayList produsList){
        Collections.sort(produsList,new SortByNume());
    }
    public void sortListByDataDeExpirare(ArrayList produsList){
        Collections.sort(produsList,new SortByDataExpirare());
    }
    public void sortListByPretMic(ArrayList produsList){
        Collections.sort(produsList,new SortByPretMic());
    }
    public void sortListByPretMare(ArrayList produsList){
        Collections.sort(produsList,new SortByPretMare());
    }

    public int searchName(ArrayList produsList,String pnume){
        System.out.println("| Nr |      Nume      |      pretDeAchizitie      |      pretDeVanzare      |      data      |      descriere      |");
        System.out.println("|---------------------------------------------------------------------------------------------------|");
        int id = -1;
        for (int i = 0;i< produsList.size();i++){
            Produse produs = (Produse) produsList.get(i);
            String nume = produs.getNume();
            double pretAchizitie = produs.getPretAchizitie();
            double pretVanzare = produs.getPretVanzare();
            LocalDate data = produs.getDataExpirare();
            String des = produs.getDescrierea();
            DateTimeFormatter dataFormatata = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String stringData = data.format(dataFormatata);
            if(pnume.equals(nume)) {
                System.out.println("| " + i + " | " + nume + " | "+ pretAchizitie+" | "+ pretVanzare + " | "+ stringData + " |"+ des + " |");
                System.out.println("|---------------------------------------------------------------------------------------------------|");
                id = i;
            }
        }
        return id;
    }
}