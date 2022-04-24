package aula01;

public class Exc13 {
    public static void main(String args[]) {
        double margemDistribuidor = 28;
        double margemImpostos = 45;
        double custoFabrica = 30000;

        double custoConsumidor = custoFabrica + custoFabrica*(1+margemDistribuidor/100)*(1+margemImpostos/100);

        System.out.println("Custo do consumidor final = " + custoConsumidor);
    }
}
