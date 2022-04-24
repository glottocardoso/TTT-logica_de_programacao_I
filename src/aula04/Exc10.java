package aula04;

import java.util.Scanner;

public class Exc10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor inteiro: ");
        int valorLido = sc.nextInt();

        int qtdCedulas100 = 0;
        int qtdCedulas50 = 0;
        int qtdCedulas20 = 0;
        int qtdCedulas10 = 0;
        int qtdCedulas5 = 0;
        int qtdCedulas2 = 0;
        int qtdCedulas1 = 0;
        int valorAtual = valorLido;

        while (valorAtual>=100){
            qtdCedulas100++;
            valorAtual -=100;
        }
        while (valorAtual>=50){
            qtdCedulas50++;
            valorAtual -=50;
        }
        while (valorAtual>=20){
            qtdCedulas20++;
            valorAtual -=20;
        }
        while (valorAtual>=10){
            qtdCedulas10++;
            valorAtual -=10;
        }
        while (valorAtual>=5){
            qtdCedulas5++;
            valorAtual -=5;
        }
        while (valorAtual>=2){
            qtdCedulas2++;
            valorAtual -=2;
        }
        while (valorAtual>=1){
            qtdCedulas1++;
            valorAtual -=1;
        }

        int qtdCedulasTotal = qtdCedulas100 + qtdCedulas50 + qtdCedulas20 + qtdCedulas10 +qtdCedulas5 + qtdCedulas2 + qtdCedulas1;

        System.out.println("Total de cédulas necessárias: " + qtdCedulasTotal);
        System.out.println("Total de cédulas de 100 necessárias: " + qtdCedulas100);
        System.out.println("Total de cédulas de 50 necessárias: " + qtdCedulas50);
        System.out.println("Total de cédulas de 20 necessárias: " + qtdCedulas20);
        System.out.println("Total de cédulas de 10 necessárias: " + qtdCedulas10);
        System.out.println("Total de cédulas de 5 necessárias: " + qtdCedulas5);
        System.out.println("Total de cédulas de 2 necessárias: " + qtdCedulas2);
        System.out.println("Total de cédulas de 1 necessárias: " + qtdCedulas1);
    }
}
