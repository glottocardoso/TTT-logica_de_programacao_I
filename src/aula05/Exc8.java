package aula05;

import java.util.Scanner;

public class Exc8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        int peso;
        int pesoAcima90 =0;
        int somaIdades = 0;

        for (int i = 1; i < 8; i++) {
            System.out.println("Digite a idade da pessoa "+i+"/7"+": ");
            idade = sc.nextInt();

            System.out.println("Digite o peso da pessoa "+i+"/7"+": ");
            peso = sc.nextInt();

            if (peso>90){
                pesoAcima90++;
            }
            somaIdades+=idade;
        }

        double mediaIdades = (double) somaIdades/7;

        System.out.println("A quantidade de pessoas com mais de 90 quilos é: "+pesoAcima90);
        System.out.println("A média das idades é: "+mediaIdades + " anos");
    }
}
