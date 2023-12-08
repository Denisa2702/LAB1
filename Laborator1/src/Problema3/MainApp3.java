package Problema3;

import java.util.Scanner;

public class MainApp3 {

    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        System.out.println("Numar: ");
        int nr=scan.nextInt();

        int c=0;

        System.out.println("Divizorii sunt:");
        for(int d=1;d<nr/2;d++)
        {
            if(nr%d==0)
            {
                c++;
                System.out.println(d+" ");
            }
        }

        if(c==1)
            System.out.println("\nNumarul este prim!");



    }
}
