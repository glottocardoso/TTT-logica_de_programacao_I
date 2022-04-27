package aula05;

import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String codigoTransacao;
        double valorTransacao;
        double valorTotalVista = 0;
        double valotTotalPrazo = 0;

        for (int i = 1; i < 16; i++) {
            System.out.println("Digite o código da transação "+i+"/15"+": ");
            codigoTransacao = sc.nextLine();
            System.out.println("Digite o valor da transação "+i+"/15"+": ");
            valorTransacao = sc.nextDouble();
            sc.nextLine();

            if (codigoTransacao.equals("V")){
                valorTotalVista += valorTransacao;
            } else if (codigoTransacao.equals("P")){
                valotTotalPrazo += valorTransacao;
            }
        }

        double valorTotal = valorTotalVista + valotTotalPrazo;
        double valorPrestacao = valotTotalPrazo/3;

        System.out.println("Valor total à vista: "+ valorTotalVista);
        System.out.println("Valor total à prazo: "+ valotTotalPrazo);
        System.out.println("Valor total das compras: " + valorTotal);
        System.out.println("Valor da primeira prestação: "+valorPrestacao);
    }
}
