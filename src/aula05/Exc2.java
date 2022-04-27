package aula05;

import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da hora: ");
        double valorHora = sc.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();

        double salarioBruto = valorHora*horasTrabalhadas;

        double aliquotaIR = 0;

        if (salarioBruto<=900){
            aliquotaIR = 0;
        }else if(salarioBruto<=1500){
            aliquotaIR = 0.05;
        }else if(salarioBruto<=2500){
            aliquotaIR = 0.10;
        }else{
            aliquotaIR = 0.20;
        }

        double salarioLiquido = salarioBruto*(1-aliquotaIR);

        System.out.println("O salário líquido é: "+salarioLiquido);
        System.out.println("Valor creditado para o FGTS: " + salarioBruto*0.11);
    }
}
