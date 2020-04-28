package com.company;

import java.time.LocalDate;

public class Produse {

        private String nume;
        private double pretAchizitie;
        private double pretVanzare;
        private LocalDate dataExpirare;
        private String descrierea;

        public void setNume(String pNume){
            this.nume = pNume;
        }
        public void setPretAchizitie(double pPretAchizitie){
            this.pretAchizitie = pPretAchizitie;
        }
        public void setPretVanzare(double  pPretVanzare){
            this.pretVanzare = pPretVanzare;
        }
        public void setDataExpirare(LocalDate pData){
            this.dataExpirare = pData;
        }
        public void setDescrierea(String pDescrierea){
            this.descrierea = pDescrierea;
        }

        public String getNume(){
            return this.nume;
        }
        public double getPretAchizitie(){
            return this.pretAchizitie;
        }
        public double getPretVanzare(){ return this.pretVanzare; }
        public LocalDate getDataExpirare() { return this.dataExpirare;   }
        public String getDescrierea() { return this.descrierea;  }
    }

