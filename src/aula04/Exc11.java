package aula04;

import java.util.Scanner;

public class Exc11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um DDD: ");
        int valorLido = sc.nextInt();

        switch (valorLido){
            case 61:
                System.out.println("Brasília");
                break;
            case 71:
                System.out.println("Salvador");
                break;
            case 11:
                System.out.println("São Paulo");
                break;
            case 21:
                System.out.println("Rio de Janeiro");
                break;
            case 32:
                System.out.println("Juiz de Fora");
                break;
            case 19:
                System.out.println("Campinas");
                break;
            case 27:
                System.out.println("Vitória");
                break;
            case 31:
                System.out.println("Belo Horizonte");
                break;
            default:
                System.out.println("DDD não cadastrado");
                break;
        }
    }
}
