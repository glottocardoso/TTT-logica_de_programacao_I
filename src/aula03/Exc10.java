package aula03;

import java.util.Scanner;

public class Exc10 {
    public static void main(String[] args) {
        int numeroCorreto = 5;
        int numeroInformado = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o número correto:");
            numeroInformado = sc.nextInt();
            if (i==2) {
                System.out.println("Você perdeu! Suas chances acabaram");
                break;
            }
            if (numeroInformado != numeroCorreto) {
                if (numeroInformado > numeroCorreto) {
                    System.out.println("Tente um número menor");
                } else {
                    System.out.println("Tente um número maior");
                }
            } else {
                System.out.println("Parabéns! Você acertou!");
                break;
            }
        }
    }
}
