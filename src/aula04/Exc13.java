package aula04;

import java.util.Scanner;

public class Exc13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo de combustível (A-álcool / G-gasolina): ");
        String combustivel = sc.nextLine();

        System.out.println("Digite o número de litros vendidos: ");
        double litros = sc.nextDouble();

        double valorSerPago = 0;

        if (combustivel.intern()=="A"){
            if(litros<=20){
                valorSerPago = 5.20*litros*0.97;
            } else {
                valorSerPago = 5.20*litros*0.95;
            }
        }else if (combustivel.intern()=="G"){
            if(litros<=20){
                valorSerPago = 7.59*litros*0.96;
            } else {
                valorSerPago = 7.59*litros*0.94;
            }
        } else {
            System.out.println("Digite um combustível válido (A-álcool / G-gasolina)");
        }
        System.out.println("O valor a ser pago é: " + valorSerPago);
    }
}
