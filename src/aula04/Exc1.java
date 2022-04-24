package aula04;

import java.util.Random;

public class Exc1 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i=0; i<10;i++ ) {
            double numero = random.nextDouble(100);
            double[] array;
            array = new double[10];
            array[i] = numero;
            System.out.println(array[i]);
        }
    }
}
