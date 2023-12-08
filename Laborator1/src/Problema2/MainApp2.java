package Problema2;

import com.sun.jdi.FloatValue;

import java.io.*;

public class MainApp2 {

    public static void main(String[] args) throws IOException {

        String nume_fis="in.txt";

        BufferedReader flux_in=new BufferedReader(new FileReader(nume_fis));
        PrintStream flux_out=new PrintStream("out.txt");

        int suma, max, min, nr, valoare;
        float m_a;
        String linie;

        suma=0;
        nr=0;

        linie=flux_in.readLine();
        valoare= Integer.parseInt(linie);
        max= valoare;
        min=valoare;
        suma= suma+valoare;
        nr++;


        while((linie=flux_in.readLine())!=null)
        {
            valoare= Integer.parseInt(linie);
            nr++;
            suma=suma+valoare;

            if(max<valoare)
                max=valoare;

            if(min>valoare)
                min=valoare;
        }

       m_a= (float)(suma) /nr;


        System.out.println("Suma: "+suma);
        System.out.println("Maxim: "+max);
        System.out.println("Minim: "+min);
        System.out.println("Media aritmetica: "+m_a);

        flux_out.println("Suma: "+suma);
        flux_out.println("Mexim: "+max);
        flux_out.println("Minim: "+min);
        flux_out.println("Media aritmetica: "+m_a);
    }
}
