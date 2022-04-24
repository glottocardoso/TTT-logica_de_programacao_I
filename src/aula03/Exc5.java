package aula03;

import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o peso:");
        double peso = sc.nextDouble();
        System.out.println("Informe a altura:");
        double altura = sc.nextDouble();

        double imc = peso/(altura*altura);

        if (imc<18.5){
            System.out.println("Abaixo do peso");
        } else if (imc<=24.9){
            System.out.println("Peso normal");
        } else if (imc<=29.9){
            System.out.println("Excesso de peso");
        } else {
            System.out.println("Obesa");
        }
        System.out.println(imc);
    }
}
