package aula03;

import java.util.Scanner;

public class Exc11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int numero1 = sc.nextInt();
        System.out.println("Informe o segundo número: ");
        int numero2 = sc.nextInt();

        for (int i=(numero1+1); i<numero2; i++){
            System.out.println(i);
        }
    }
}
