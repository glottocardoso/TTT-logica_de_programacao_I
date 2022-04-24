package aula01;

public class Exc3 {
    public static void main(String args[]) {
    double C = 10000;
    double t = 10;
    double i = 0.02;
    double M = C*Math.pow((1+i),t);

    System.out.println("Valor a ser pago = " + M);
    }
}
