package aula04;

import java.util.Scanner;

public class Exc12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o salário fixo: ");
        double salarioFixo = sc.nextDouble();
        System.out.println("Informe o valor das vendas: ");
        double valorVendas = sc.nextDouble();

        double salario;
        double salarioAdicional = valorVendas*0.03;

        if (valorVendas<=1500){
            salario = salarioFixo + salarioAdicional;
        } else {
            salario = salarioFixo + salarioAdicional + (valorVendas-1500)*0.05;
        }
        System.out.println("Valor do salário total: " + salario);
    }
}
