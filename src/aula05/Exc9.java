package aula05;

import java.util.Scanner;

public class Exc9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu de Opções:");
        System.out.println("\t1.Média aritmética");
        System.out.println("\t2.Média ponderada");

        int opcao = sc.nextInt();
        int somaNotas=0;
        int ponderadaNotai;
        int ponderadaPesoi;
        int ponderadaNumerador = 0;
        int ponderadaDenominador = 0;
        double media;

        if (opcao==1) {
            for (int i = 1; i < 3; i++) {
                System.out.println("Digite a nota " + i+ ": ");
                somaNotas += sc.nextInt();
            }
            media = (double) somaNotas / 2;

            System.out.println("A média aritmétia é: "+media);
        }else if (opcao==2){
            for (int i = 1; i < 4; i++) {
                System.out.println("Digite a nota: " + i + ": ");
                ponderadaNotai = sc.nextInt();

                System.out.println("Digite o peso " + i + ": ");
                ponderadaPesoi = sc.nextInt();

                ponderadaNumerador += ponderadaNotai*ponderadaPesoi;
                ponderadaDenominador += ponderadaPesoi;
            }
            media = (double) ponderadaNumerador/ponderadaDenominador;

            System.out.println("A média ponderada é: "+media);
        }else {
            System.out.println("Opção inválida");
        }
    }
}
