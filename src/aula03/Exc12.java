package aula03;

import java.util.Scanner;

public class Exc12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Sexo (f, m): ");
        String sexo = sc.nextLine();

        System.out.println("Salário: ");
        double salario = sc.nextDouble();
        sc.nextLine();

        System.out.println("Estado civil (s, c, v, d): ");
        String estadoCivil = sc.nextLine();

        if (nome.length()<3){
            System.out.println("O nome deve ter no mínimo 3 letras");
        }
        if (idade<0 || idade>150){
            System.out.println("Idade inválida");
        }
        if (salario<0){
            System.out.println("Salário inválido");
        }
        if (!sexo.equals("f") && !sexo.equals("m") ){
            System.out.println("Sexo inválido");
        }
        if (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d")){
            System.out.println("Estado civil inválido");
        }
    }
}
