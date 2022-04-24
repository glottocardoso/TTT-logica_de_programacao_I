package aula04;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Exc16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pessoas[] = new String[10];
        boolean achei = false;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome da pessoa "+i+ ": ");
            pessoas[i] = sc.nextLine();
        }
        System.out.println("Digite o nome de uma pessoa: ");
        String pessoa = sc.nextLine();

        for (int j = 0; j < pessoas.length; j++) {
            System.out.println(pessoas[j]);
            if (pessoa.equals(pessoas[j])){
                achei = true;
                break;
            }
        }

        if (achei) {
            System.out.println("ACHEI");
        }else{
            System.out.println("NÃO ACHEI");
        }
    }
}
