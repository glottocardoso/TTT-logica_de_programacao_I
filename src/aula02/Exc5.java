package aula02;

import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        double autonomiaCarro = 12;

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tempo gasto na viagem (horas):");
        double tempo = sc.nextDouble();
        System.out.println("Informe velocidade média (km/h):");
        double velocidadeMedia = sc.nextDouble();

        double distancia = tempo*velocidadeMedia;
        double litrosUsados = distancia/autonomiaCarro;

        System.out.println("Serão necessários " + litrosUsados + " litros para essa viagem.");
    }
}
