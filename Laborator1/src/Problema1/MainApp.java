package Problema1;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        float l, L, P, A;

        Scanner scan=new Scanner (System.in);

        System.out.println("lungine= ");
        l=scan.nextFloat();

        System.out.println("latime=");
        L=scan.nextFloat();

        P=2*l+2*L;
        A=l*L;

        System.out.println("Perimetru: "+P+ "\nAria: "+A);

    }
}
