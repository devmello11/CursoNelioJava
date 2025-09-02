package POO;

import Entities.PdArrays02;

import java.util.Locale;
import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PdArrays02[] vect = new PdArrays02[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new PdArrays02(nome,price);

        }

        double soma = 0.0;

        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPrice();

        }
        double media = soma/ vect.length;

        System.out.printf("A média do produto é %.2f%n",media);








        sc.close();
    }

}
