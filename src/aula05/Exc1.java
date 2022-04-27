package aula05;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de anos que fuma: ");
        int anos = sc.nextInt();

        System.out.println("Digite o número de cigarro fumados por dia: ");
        int cigarros = sc.nextInt();

        System.out.println("Digite o preço de uma carteira de 20 cigarros: ");
        double preco = sc.nextDouble();

        System.out.println("A quantidade de dinheiro gasta é :"+anos*365*cigarros*preco);
    }
}
