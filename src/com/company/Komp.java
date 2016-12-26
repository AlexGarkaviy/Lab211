package com.company;

/**
 * Created by garkaviy on 13.12.2016.
 */
public class Komp {
    private  String manufakture;
    private int serialNumber;
    private double prise;
    private int quantityCPU;
    private int frequencyCPU;

    public void printKomp() {
        System.out.println(manufakture+" "+serialNumber+" "+prise+" "+quantityCPU+" "+frequencyCPU);
    }






    public String getManufakture() {
        return manufakture;
    }

    public void setManufakture(String manufakture) {
        this.manufakture = manufakture;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrise() {
        return  prise;
    }

    public void setPrise(double prise) {
        this.prise =  prise;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }



}

