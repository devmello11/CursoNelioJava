package POO;

import java.util.Locale;
import java.util.Scanner;

public class Arrays01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números vc quer dividir");
        int n = sc.nextInt();

        double [] vect = new double[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Digite um número:");
                vect[i] = sc.nextDouble();
            }
            double sum = 0.0;
        for (int i = 0; i < n; i++) {

            sum += vect[i];
        }
        double avg = sum / n ;
        System.out.printf("A média é: %.2f%n ", avg);
        sc.close();
    }



}
