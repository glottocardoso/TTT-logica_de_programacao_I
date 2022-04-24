package aula03;

import java.util.Scanner;

public class Exc8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        double soma = 0;
        double maiorValor = 1;
        double menorValor = 1;
        double media = 0;
        int numeroImpressao = 1;

        for (int i=0;i<numeros.length;i++) {
            System.out.println("Informe o número inteiro positivo " + numeroImpressao + ":");
            numeros[i] = sc.nextDouble();
            numeroImpressao++;

            if (numeros[i]>maiorValor){
                maiorValor=numeros[i];
            }

            if (numeros[i]<menorValor){
                menorValor=numeros[i];
            }

            soma += numeros[i];
        }
        media = soma/numeros.length;

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Média: " + media);
    }

}
