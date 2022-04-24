package aula04;

import java.util.Scanner;

public class Exc17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = 0;
        int somaNumeroFilhos =0;
        double maiorSalario = 0;
        int salariosMenores1500 = 0;
        double somaSalarios = 0;
        int i=-1;

        do {
            i++;
            System.out.println("Digite o salário: ");
            salario = sc.nextDouble();
            if (salario>0) {
                somaSalarios += salario;
                System.out.println("Digite o número de filhos");
                somaNumeroFilhos += sc.nextInt();
                if (salario > maiorSalario) {
                    maiorSalario = salario;
                }
                if (salario < 150) {
                    salariosMenores1500++;
                }
            }
        } while (salario>0);

        double mediaSalarios = somaSalarios/i;
        double mediaNumeroFilhos = (double) somaNumeroFilhos/i;
        double percentualSalariosMenores = (double) salariosMenores1500/i*100;

        System.out.println("Média de salário da população: "+mediaSalarios);
        System.out.println("Média do número de filhos: "+ mediaNumeroFilhos);
        System.out.println("Maior salário dos habitantes: "+maiorSalario);
        System.out.println("Percentual de pessoas com salário menor que R$ 150,00: "+ percentualSalariosMenores + "%");
    }
}
