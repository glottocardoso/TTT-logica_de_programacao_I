package aula02;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome:");
        String nome = sc.nextLine();
        System.out.println("Informe a turma:");
        String turma = sc.nextLine();
        System.out.println("Informe a nota 1");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a nota 2");
        double nota2 = sc.nextDouble();
        System.out.println("Informe a nota 3");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;

        System.out.printf("A média do aluno %s da turma %s é %f %n", nome, turma, media);
    }
}
