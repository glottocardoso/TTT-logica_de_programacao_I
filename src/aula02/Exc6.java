package aula02;

import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[4];
        double soma = 0;

        for (int i=0;i<numeros.length;i++) {
            System.out.println("Informe o número " + i + ":");
            numeros[i] = sc.nextDouble();
            numeros[i] = numeros[i]*numeros[i];
            soma += numeros[i];
        }

        System.out.println("A soma dos quadrados dos números é: "+soma);
    }
}
