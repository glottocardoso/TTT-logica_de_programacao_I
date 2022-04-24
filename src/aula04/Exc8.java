package aula04;

import java.util.Scanner;

public class Exc8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valores[] = new int[10];
        int verificador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um valor até 100:");
            valores[i] = sc.nextInt();
        }
        System.out.println("Digite o valor a ser verificado:");
        int valorDigitado = sc.nextInt();

        for (int y = 0; y < 10; y++) {
            if (valorDigitado == valores[y]) {
                System.out.println("O valor existe no conjunto");
                verificador = 1;
                break;
            }
        }
        if (verificador != 1) {
            System.out.println("O valor não existe no conjunto");
        }
    }
}