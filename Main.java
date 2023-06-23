import java.util.Scanner;

import static java.lang.Math.log;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        double vyska = 200000;//m
        double rychlost = 1500; //m/s
        double hmotnostR = 8000; //kg
        double hmotnostP = 8000; //kg
        double zrychleni = 1.6; // m/s
        double vykon = 0;
        int w = 3000;//konstanta
        int t = 0;

        Scanner sc = new Scanner(System.in);

        while(vyska >= 0){
            System.out.println("aktualni vyska: "+vyska/1000 + " km");
            System.out.println("aktualni rychlost: "+rychlost + "m/s");
            System.out.println("zbyva paliva: "+hmotnostP/1000 + "tun");

            System.out.println("zadej vykon v "+t*10+". sekunde letu: ");
            t++;
            vykon = sc.nextDouble();
            if(vykon > 100){
                vykon = 100;
            }
            if(vykon < 0){
                vykon=0;
            }
            /*
            hmotnostP = hmotnostP - vykon;


            rychlost = w*Math.log((hmotnostP+hmotnostR)/((hmotnostP-vykon)+hmotnostR));
            vyska -= rychlost*10;
            rychlost+= 16;


             */
            //
            double ms = 8000 + hmotnostP;
            double mk = ms - vykon*10;
            hmotnostP -= vykon;
            double vdiff = 3000*Math.log(ms/mk);

            hmotnostP -= vykon*10;
            vyska -= rychlost*10;
            rychlost+= 16-vdiff*10;










            //zeptame se na vykon

            //vypocitame o kolik zpomalime a kolik mame paliva

            //cekame vterinu?
        }

        System.out.println("rychlost pristani: "+rychlost);
        System.out.println("vyska: "+vyska);
    }


}