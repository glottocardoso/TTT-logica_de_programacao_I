package aula02;

import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        String[] praias = new String[5];
        double[] distancias = new double[5];
        double soma = 0;
        int distanciaEntre = 0;
        String praiaMaisDistante ="";
        double maiorDistancia = 0;

        Scanner sc = new Scanner(System.in);

        for (int i=0;i<praias.length;i++) {
            int numeroPraia1 = i+1;
            System.out.println("Informe o nome da praia " + numeroPraia1 + ":");
            praias[i] = sc.nextLine();
        }

        for (int i=0;i<praias.length;i++) {
            System.out.println("Informe a distância da praia '" + praias[i] + "':");
            distancias[i] = sc.nextDouble();

            soma += distancias[i];

            if (distancias[i]>10 && distancias[i]<15) {
                distanciaEntre += 1;
            }

            if (distancias[i] > maiorDistancia) {
                maiorDistancia = distancias[i];
                praiaMaisDistante = praias[i];
            }
        }

        double distanciaMedia = soma/distancias.length;

        System.out.println("A praia mais distante é: " + praiaMaisDistante);
        System.out.println("Existe(m) " + distanciaEntre + " praia(s) que está(ão) a mais de 10km e a menos de 15km");
        System.out.println("A distancia média das praias é " + distanciaMedia);
    }
}
