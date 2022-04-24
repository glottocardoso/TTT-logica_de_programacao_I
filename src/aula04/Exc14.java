package aula04;

import java.util.Scanner;

public class Exc14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a idade do primeiro homem: ");
        int idadeHomem1 = sc.nextInt();
        System.out.println("Digite a idade do segundo homem: ");
        int idadeHomem2 = sc.nextInt();
        System.out.println("Digite a idade da primeira mulher: ");
        int idadeMulher1 = sc.nextInt();
        System.out.println("Digite a idade da segunda mulher: ");
        int idadeMulher2 = sc.nextInt();

        int idadeHomemMaisVelho;
        int idadeHomemMaisNovo;
        int idadeMulherMaisVelha;
        int idadeMulherMaisNova;


        if (idadeHomem1>idadeHomem2){
            idadeHomemMaisVelho = idadeHomem1;
            idadeHomemMaisNovo = idadeHomem2;
        }else{
            idadeHomemMaisVelho = idadeHomem2;
            idadeHomemMaisNovo = idadeHomem1;
        }
        if (idadeMulher1>idadeMulher2){
            idadeMulherMaisVelha = idadeMulher1;
            idadeMulherMaisNova = idadeMulher2;
        }else{
            idadeMulherMaisVelha = idadeMulher2;
            idadeMulherMaisNova = idadeMulher1;
        }

        int somaIdades = idadeHomemMaisVelho + idadeMulherMaisNova;
        int produtoIdades = idadeHomemMaisNovo*idadeMulherMaisVelha;

        System.out.println("Soma das idades = " + somaIdades);
        System.out.println("Produto das idades = " + produtoIdades);
    }
}
