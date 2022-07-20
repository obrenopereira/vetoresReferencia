package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        int n = read.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i<vect.length; i++){
            read.nextLine();
            String name = read.nextLine();
            double price = read.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i<vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum/vect.length;
        System.out.printf("AVERENGE RANGE = + %.2f", avg);


    }

}
