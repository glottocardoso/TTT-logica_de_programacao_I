package aula04;

import java.util.Scanner;

public class Exc15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos a ser cadastrada: ");
        int qtdProdutos = sc.nextInt();

        String nomeProdutos[] = new String[qtdProdutos];
        int qtdEstoque[] = new int[qtdProdutos];
        double valorUnitario[] = new double[qtdProdutos];
        int qtdEstoqueTotal = 0;
        double valorTotalEstoque = 0;

        for (int i = 0; i < qtdProdutos; i++) {
            System.out.println("Digite o nome do produto "+i+ ": ");
            nomeProdutos[i] = sc.nextLine();
            sc.nextLine();
            System.out.println("Digite número total de mercadorias em estoque do produto "+i+ ": ");
            qtdEstoque[i] = sc.nextInt();
            qtdEstoqueTotal += qtdEstoque[i];
            System.out.println("Digite o valor unitário do produto "+i+ ": ");
            valorUnitario[i] = sc.nextDouble();
            valorTotalEstoque += qtdEstoque[i]*valorUnitario[i];
        }
        double valorMedio = valorTotalEstoque/qtdEstoqueTotal;

        System.out.println("Quantidade total de mercadorias no estoque: "+qtdEstoqueTotal);
        System.out.println("Valor médio das mercadorias em estoque: "+valorMedio);
    }
}
