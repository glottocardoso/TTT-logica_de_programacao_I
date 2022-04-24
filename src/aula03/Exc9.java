package aula03;

import java.util.Scanner;

public class Exc9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        int numeroImpressao = 1;

        for (int i=0;i<numeros.length;i++) {
            System.out.println("Informe a idade da pessoa " + numeroImpressao + ":");
            numeros[i] = sc.nextInt();
            numeroImpressao++;

            if (numeros[i]>18){
                soma++;
            }
        }

        System.out.println("Pessoas que possuem mais de 18 anos: " + soma);
    }
}
