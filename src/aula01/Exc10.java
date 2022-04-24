package aula01;

public class Exc10 {
    public static void main(String args[]) {
        double valorDepositado = 1000;
        double valorCorrigido = valorDepositado*(1+0.7/100);

        System.out.println("Valor com rendimento " + valorCorrigido);
    }
}
