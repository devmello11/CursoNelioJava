package ArrayLoiane;

import java.util.Locale;
import java.util.Scanner;

public class TemperaturaDiaria {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    double[] temp = new double[6];
        temp[0] = 31.3;
        temp[1] = 32;
        temp[2] = 33.2;
        temp[3] = 30.1;
        temp[4] = 33.6;
        temp[5] = 37;


        System.out.println("O valor da tempoeradora do dia 3 é: "+temp[2]);
        System.out.println("Tamanho do Array: "+temp.length);

        for (int i = 0; i < temp.length; i++) {
            System.out.println("O valor da temperatura do dia "+ (i+1)+ " é: "+temp[i]);

        }


    sc.close();
    }
}
