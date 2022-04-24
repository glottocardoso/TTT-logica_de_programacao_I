package aula03;

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a nota 1");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a nota 2");
        double nota2 = sc.nextDouble();
        System.out.println("Informe a nota 3");
        double nota3 = sc.nextDouble();
        double media = (nota1 + nota2 + nota3)/3;

        if(media>=7){
            System.out.println("O aluno foi aprovado");
        }else{
            System.out.println("O aluno está de recuperação");
        }
    }
}
