package aula03;

import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro maior que zero:");
        int numero = sc.nextInt();
        int fatorial = 1;

        for (int i = numero;i>=1;i--){
            fatorial = i*fatorial;
        }
        System.out.println("O fatorial do número " + numero + " é: " + fatorial);
    }
}
