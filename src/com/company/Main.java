package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Komp[] computers = new Komp[5];


        for (int i = 0; i < 5; i++) {
            //Komp comp = new Komp();
           // computers[i]   =new Komp("A", 1, 1, 1, 1);
            computers[i] = new Komp();
            computers[i].setPrise(100);
        }

        //double z;
       // double prise = 1.1;
        for (int i = 0; i < computers.length; i++) {
            computers[i].setPrise(1.1 * computers[i].getPrise());
           // z = computers[i].getPrise();
            //computers[i].setPrise (z * prise);
            computers[i].printKomp();

            //z = (int) (computers[i].getPrise()* (1+p)/100);
            //computers[i].setPrise( z * 1.1);

        }

    }
}

